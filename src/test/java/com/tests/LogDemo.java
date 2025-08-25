package com.tests;

import com.nonRunnable.BaseClass;

public class LogDemo extends BaseClass {
	
	public static void main(String[] args) {
		logger.info("It is info message");
		logger.error("It is error message");
		logger.fatal("It is fatal message");
		logger.warn("It is warn message");
	}

}
