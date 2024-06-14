package com.chubb.workview.certificateservice._2016._06;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.log4j.Logger;

public class JaxWsLoggingHandler implements SOAPHandler<SOAPMessageContext> {

	 private static final Logger LOG = Logger.getLogger(JaxWsLoggingHandler.class);
   

   @Override
   public boolean handleFault(SOAPMessageContext arg0) {
       SOAPMessage message = arg0.getMessage();
       ByteArrayOutputStream out = new ByteArrayOutputStream();
      
          
           try {
			message.writeTo(out);
		
           LOG.info("Fault MESSAGE\n");
           LOG.info(out.toString());
       
           } catch (SOAPException | IOException e) {
   			LOG.error(e);
   			
   		}
       
       return true;
   }

   @Override
   public boolean handleMessage(SOAPMessageContext arg0) {
       SOAPMessage message = arg0.getMessage();
       try {
       boolean isOutboundMessage = (Boolean) arg0.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
       ByteArrayOutputStream out = new ByteArrayOutputStream();
       if (isOutboundMessage) 
    	   LOG.info("OUTBOUND MESSAGE\n");
       else 
    	   LOG.info("INBOUND MESSAGE\n");
       	message.writeTo(out);
		     LOG.info(out.toString());
      
           } catch (SOAPException | IOException e) {
   			
        	   LOG.error(e);
   		}   
           
       return true;
   }

   @Override
   public Set<QName> getHeaders() {
	   Set<QName>s=new HashSet<QName>();
	    return s;
   }

@Override
public void close(MessageContext context) {
	// Nothing
	
}

}
