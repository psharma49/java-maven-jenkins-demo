package com.infosys.product1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Application {
	static final Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String args[]) {
		System.out.println("Hello Maven");
		logger.debug("hello Maven");
		logger.info("this is a info message");
		logger
		logger.error("this is a error");
		logger.trace("trace message");
		logger.warn("this is a warn message");
	}

}
