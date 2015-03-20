package com.paypal.java.spring.logging.impl3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.paypal.java.spring.logging.api.Animal;

@Component
public class Human implements Animal {

	static Logger logger = LoggerFactory.getLogger(Human.class);

	public Human() {

	}

	public String getType() {
		logger.info("INFO - This is Human Class");
		logger.warn("WARN - This is Human Class");
		logger.debug("DEBUG - This is Human Class");
		logger.error("ERROR - This is Human Class");
		return "Omnivore";
	}

	public String eats() {
		return "Plants and Meat";
	}

	public int noOfLegs() {
		return 2;
	}

}
