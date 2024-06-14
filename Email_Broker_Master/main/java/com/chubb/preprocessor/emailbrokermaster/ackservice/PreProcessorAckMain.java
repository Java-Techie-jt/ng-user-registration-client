package com.chubb.preprocessor.emailbrokermaster.ackservice;

import com.chubb.preprocessors.emailbrokermaster.preprocessor.PreprocesseACK;
import com.chubb.preprocessors.emailbrokermaster.preprocessor.ResourceLoader;
import com.chubb.preprocessors.emailbrokermaster.service.DBConnectionError;
import com.chubb.preprocessors.emailbrokermaster.service.ProgramException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;



public class PreProcessorAckMain {

    private static final Logger LOG = Logger.getLogger(PreProcessorAckMain.class);

    static ResourceLoader resources = ResourceLoader.getResources();

    @SuppressWarnings("unchecked")
   
    public static void main(String[] args) {
    	LOG.info("Start execution for ACK Module");
        Map<String, List<DocumentBean>> mp = new HashMap<String, List<DocumentBean>>();
        try {
            mp = PreProcessorDAO.getDAOObject().getACKDetails();
        } catch (ProgramException | DBConnectionError e1) {
        	LOG.info("Error occured in PreProcessorAckMain:" + e1);
        }

        int count=0;
        String str = new String();
        String to = new String();

        for (String key : mp.keySet()) {
            str = resources.getConstantproperties().getProperty("ACK_DEFAULT_TEXT");
            List<DocumentBean> documentBean = new ArrayList<DocumentBean>();


            documentBean = mp.get(key);

            for (DocumentBean db : documentBean) {

                str = str + db.getDocName() + " Checksum matches.";
               

                to = db.getFromEmailId();

                if ("Y".equalsIgnoreCase(db.getIsDocumentOGIMD5CheckSumMatch())) {
                    str = str + "\n" + db.getDocName() + " is already exist";
                } else {
                    str = str + "\n" + db.getDocName() + " is linked to Policy";

                }
                str = str + "\n";
            }

            try {
            	  String from = resources.getConstantproperties().getProperty("AOL_FROM");
            	  String sub=resources.getConstantproperties().getProperty("DEFAULT_ACK_SUBJECT")+": "+documentBean.get(0).getPolNumber();
          //      if (sendAck(to, str)) {
            	if(PreprocesseACK.sendACK(from,to,sub,str)){
                	LOG.info("ACK mail sent for:"+documentBean.get(0).getPolNumber() );
                    count++;
                    try {
                        PreProcessorDAO.getDAOObject().executeUpdate(key);
                    } catch (DBConnectionError e) {
                       LOG.error(e);
                    }

                }
               
            } catch (ProgramException e) {
               LOG.info(e);
            }

            str = null;

        }
        LOG.info("No of ACK mail sent-"+count);
        LOG.info("ACK Processing completed");


    }

  

}
