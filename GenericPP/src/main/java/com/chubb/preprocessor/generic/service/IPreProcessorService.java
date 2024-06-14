package com.chubb.preprocessor.generic.service;

import java.io.File;

import com.chubb.preprocessor.generic.preprocessor.DBConnectionError;
import com.chubb.preprocessor.generic.preprocessor.ProgramException;

public interface IPreProcessorService {
	void initProcess(File f, File[] files, String directory) throws ProgramException, DBConnectionError;
}
