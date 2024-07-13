package com.chubb.preprocessors.emailbrokermaster.preprocessor;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.rmi.server.UID;
import java.util.EnumSet;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

import com.chubb.preprocessors.emailbrokermaster.beans.DocumentBean;
import com.chubb.preprocessors.emailbrokermaster.beans.RoutingBean;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.service.EmailPreprocessorServiceImpl;
import com.chubb.preprocessors.emailbrokermaster.service.IEmailPreprocessorService;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;
import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.PropertySet;
import microsoft.exchange.webservices.data.core.enumeration.misc.ConnectingIdType;
import microsoft.exchange.webservices.data.core.enumeration.misc.ExchangeVersion;
import microsoft.exchange.webservices.data.core.enumeration.misc.TraceFlags;
import microsoft.exchange.webservices.data.core.enumeration.property.BasePropertySet;
import microsoft.exchange.webservices.data.core.enumeration.property.WellKnownFolderName;
import microsoft.exchange.webservices.data.core.enumeration.search.FolderTraversal;
import microsoft.exchange.webservices.data.core.enumeration.search.ItemTraversal;
import microsoft.exchange.webservices.data.core.enumeration.search.SortDirection;
import microsoft.exchange.webservices.data.core.exception.service.local.ServiceLocalException;
import microsoft.exchange.webservices.data.core.service.folder.Folder;
import microsoft.exchange.webservices.data.core.service.item.EmailMessage;
import microsoft.exchange.webservices.data.core.service.item.Item;
import microsoft.exchange.webservices.data.core.service.schema.FolderSchema;
import microsoft.exchange.webservices.data.core.service.schema.ItemSchema;
import microsoft.exchange.webservices.data.credential.ExchangeCredentials;
import microsoft.exchange.webservices.data.credential.WebCredentials;
import microsoft.exchange.webservices.data.misc.ITraceListener;
import microsoft.exchange.webservices.data.misc.ImpersonatedUserId;
import microsoft.exchange.webservices.data.property.complex.FolderId;
import microsoft.exchange.webservices.data.property.complex.ItemId;
import microsoft.exchange.webservices.data.property.complex.MimeContent;
import microsoft.exchange.webservices.data.search.FindFoldersResults;
import microsoft.exchange.webservices.data.search.FindItemsResults;
import microsoft.exchange.webservices.data.search.FolderView;
import microsoft.exchange.webservices.data.search.ItemView;

public class MailBoxService_BK  {

	private static final Logger LOG = Logger.getLogger(MailBoxService_BK.class);
	
	private static final String SERVICE_ACC =ResourceLoader.getResources().getConstantproperties().getProperty("ServiceACC");
	private static final String PASS =ResourceLoader.getResources().getConstantproperties().getProperty("PASSWORD");
	private static final String DOMAIN =ResourceLoader.getResources().getConstantproperties().getProperty("DOMAIN");
	private static final String EWS_URL =ResourceLoader.getResources().getConstantproperties().getProperty("EWS.URL");
	private static final  String EMAILPREPROCESSORARCHIVE=ResourceLoader.getResources().getConstantproperties().getProperty("WV.Archive");
	static final  String EMAILPREPROCESSORERROR=ResourceLoader.getResources().getConstantproperties().getProperty("WV.Error");
//	private static Item currItem;

	public void initProcess(String cc,RoutingBean rb,String temp) {
			

			LOG.info("Processing started for: "+cc);
			fetchMailsFromInbox(cc,rb,temp);
			if(Thread.currentThread().getName().indexOf('_',0)!=-1)
				Thread.currentThread().setName(Thread.currentThread().getName().substring(0,Thread.currentThread().getName().indexOf('_',0)));
	}
		
		public void fetchMailsFromInbox(String emailId,RoutingBean rb,String temp)  {
			
			ExchangeService service = null;

			if(ResourceLoader.getResources().getConstantproperties().getProperty("COUNTRIES.LIVE").equalsIgnoreCase("RU")){
				/*Only For Russia Prod*/
				 service = new ExchangeService(ExchangeVersion.Exchange2010);
			} else {
				/*For Other countries*/
				 service = new ExchangeService(ExchangeVersion.Exchange2010_SP2);
			}
			
			ExchangeCredentials credentials = new WebCredentials(SERVICE_ACC, PASS,DOMAIN);
		/*	service.setTraceEnabled(true);
		service.setTraceFlags(EnumSet.allOf(TraceFlags.class));
			service.setTraceListener(new ITraceListener() {

		         public void trace(String traceType, String traceMessage) {
		         	 LOG.info("Type:" + traceType + " Message:" + traceMessage);
		         }
		     });*/

		
			FindItemsResults<Item> results;
			service.setCredentials(credentials);
			service.setImpersonatedUserId(new ImpersonatedUserId(ConnectingIdType.SmtpAddress,emailId));
			 try {
			service.setUrl(new URI(EWS_URL));
			service.getHttpHeaders().put("X-AnchorMailbox",emailId);
			
			int pageSize = Integer.parseInt(ResourceLoader.getResources().getConstantproperties().getProperty("PAGE.SIZE"));
			int offset = 0;
			 int moreItems =Integer.parseInt(ResourceLoader.getResources().getConstantproperties().getProperty("MAX.ITEM"));
			 int totalItemProcess=0;
			FolderId arId = null;
					FolderId erId=null;
			 //SetView
		        FolderView folderview = new FolderView(50);
		        folderview.setPropertySet(new PropertySet(FolderSchema.DisplayName));

		        folderview.setTraversal(FolderTraversal.Shallow);
		        FindFoldersResults findFolderResults = service.findFolders(WellKnownFolderName.MsgFolderRoot, folderview);
		        //find specific folder
		        for(Folder f : findFolderResults)
		        {
		         
		            if (EMAILPREPROCESSORARCHIVE.equalsIgnoreCase(f.getDisplayName()))
		            	arId=f.getId();
		            else if(EMAILPREPROCESSORERROR.equalsIgnoreCase(f.getDisplayName()))
		            	erId=f.getId();
		            	 if(arId!=null&&erId!=null)
		            		 break;
		            }
		        
		        if(arId==null){       
		        	Folder folder = new Folder(service);
		        	folder.setDisplayName(EMAILPREPROCESSORARCHIVE);
				folder.save(WellKnownFolderName.MsgFolderRoot);
		        }
		        if(erId==null){
		        	Folder folder = new Folder(service);
		        	folder.setDisplayName(EMAILPREPROCESSORERROR);
				folder.save(WellKnownFolderName.MsgFolderRoot);
		        }   
		  
			 while(moreItems>0){
			 		   ItemView view = new ItemView(pageSize, offset);
					   view.getOrderBy().add(ItemSchema.DateTimeReceived, SortDirection.Ascending);
					   view.setTraversal(ItemTraversal.Shallow);
					   results = service.findItems(WellKnownFolderName.Inbox,view);
			
			if(results.getTotalCount()>0){
			 service.loadPropertiesForItems(results, new PropertySet(ItemSchema.MimeContent));
			 
			int displayCount = results.getTotalCount() > pageSize ? pageSize : results.getTotalCount();
			
			 for (int i = 0; i < displayCount; i++,totalItemProcess++)
	            {
				 String packageId=generatePackageID();
				
					Thread.currentThread().setName(temp+"_"+packageId);
				     Item item=results.getItems().get(i);
//				     currItem = item;
//				     LOG.info("Item:"+item);
//				     LOG.info("currItem:"+currItem);
	            	MimeContent mc =item.getMimeContent();
	            	
	    	 
	    		try{
	    			IEmailPreprocessorService brokerService=new EmailPreprocessorServiceImpl();
	    			brokerService.initProcess(mc.getContent(),rb,packageId);
	    			
	    			moveEmail(service,item.getId(),arId);
	    			LOG.info("Successfully moved to Archive folder");
	    		
	    		}catch(Exception p1){
	    			p1.printStackTrace();
	    			LOG.error("Error in MailBoxService:"+p1);
	    					LOG.info(p1);
	    					LOG.info("Moving email to Error folder");
	    					moveEmail(service,item.getId(),erId);
	    				
	    		}
	    		 
	    	}
			 if(displayCount==pageSize&&moreItems>=pageSize){
    					results.setNextPageOffset(pageSize);
    					moreItems-=pageSize;
    					}else{
    						moreItems=0;}
			 
	            }
				 
			 else{LOG.info("No new Email found for: "+emailId+" all are processed");
			break;
			}	
	}
			 LOG.info(totalItemProcess+" Email processed" + emailId); 
	}catch(Exception e){  
		e.printStackTrace();
		    	LOG.info(e);
		 }finally{service.close();}

		}
		private void moveEmail(ExchangeService service, ItemId id,FolderId fd)   {
			
			try {
				EmailMessage beforeMessage =EmailMessage.bind(service, id, new PropertySet(BasePropertySet.IdOnly));
				//EmailMessage beforeMessage = EmailMessage.bind(service,id);
			if(fd!=null)
				
			beforeMessage.move(fd);
			} catch (Exception e) {
				LOG.info(e.getMessage());
					
			}
		}
		
		/*
		 * Method generatePackageID is to generate a unique package ID and Return
		 * back to caller.
		 */
		private String generatePackageID() {
			return new UID()+"";
		}
}
