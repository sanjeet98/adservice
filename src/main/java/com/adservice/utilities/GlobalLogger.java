package com.adservice.utilities;

 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

 

public class GlobalLogger {
    @SuppressWarnings("rawtypes")
	public static Logger getLogger(Class classname) {
        return LoggerFactory.getLogger(classname);
    }
}