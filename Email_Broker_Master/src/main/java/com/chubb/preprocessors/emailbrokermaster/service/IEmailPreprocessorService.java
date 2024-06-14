package com.chubb.preprocessors.emailbrokermaster.service;



import java.io.InputStream;

import com.chubb.preprocessors.emailbrokermaster.beans.RoutingBean;

/**
 * Created by sxgonn on 08/03/2016. This is an Interface class for the
 * EmailBroker Execution service.
 */

public interface IEmailPreprocessorService {
    void initProcess(byte[] file,RoutingBean rb,String packageId)throws ProgramException;
    
}
