package com.prisma.eresumen;

import org.apache.log4j.Logger;

public class BeanPrueba {

	private static Logger logger = Logger.getLogger(BeanPrueba.class);
	
	static {
		System.out.println("static BeanPrueba.println");
		logger.debug("static BeanPrueba.debug");
		logger.info("static BeanPrueba.info");
		logger.warn("static BeanPrueba.warn");
		logger.error("static BeanPrueba.error");
		logger.fatal("static BeanPrueba.fatal");
		
	}
	
	public BeanPrueba() {
		System.out.println("BeanPrueba.println");
		logger.debug("BeanPrueba.debug");
		logger.info("BeanPrueba.info");
		logger.warn("BeanPrueba.warn");
		logger.error("BeanPrueba.error");
		logger.fatal("BeanPrueba.fatal");
	}
	
}
