package com.paypal.java.spring.logging.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.paypal.java.spring.logging.api.Animal;

@Component
public class Cow implements Animal {

	static Logger logger = LoggerFactory.getLogger(Cow.class);

	public Cow() {
	}

	public String getType() {
		logger.info("INFO - This is Cow Class");
		logger.warn("WARN - This is Cow Class");
		logger.debug("DEBUG - This is Cow Class");
		logger.error("ERROR - This is Cow Class");
		return "Herbivore";
	}

	public String eats() {
		return "Plants";
	}

	public int noOfLegs() {
		return 4;
	}

}
