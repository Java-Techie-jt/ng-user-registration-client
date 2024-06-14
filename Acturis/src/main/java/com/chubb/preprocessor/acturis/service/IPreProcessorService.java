package com.chubb.preprocessor.acturis.service;

import com.chubb.preprocessor.acturis.bean.DocumentBean;
import com.chubb.preprocessor.acturis.preprocessor.DBConnectionError;
import com.chubb.preprocessor.acturis.preprocessor.ProgramException;

public interface IPreProcessorService {
	void initProcess(String Id, DocumentBean db, String temp, boolean isStatusCheck) throws ProgramException;
}
