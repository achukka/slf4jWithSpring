package com.paypal.java.spring.logging.impl2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.paypal.java.spring.logging.api.Animal;

@Component
public class Dolphin implements Animal {

	static Logger logger = LoggerFactory.getLogger(Dolphin.class);

	public String getType() {
		logger.info("INFO - This is Dolphin Class");
		logger.warn("WARN - This is Dolphin Class");
		logger.debug("DEBUG - This is Dolphin Class");
		logger.error("ERROR - This is Dolphin Class");
		return "Carnivore";
	}

	public String eats() {
		return "Fish";
	}

	public int noOfLegs() {
		return 0;
	}

}
