package com.paypal.java.spring.logging.impl2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.paypal.java.spring.logging.api.Animal;


@Component
public class Dog implements Animal {
	static Logger logger = LoggerFactory.getLogger(Dog.class);

	public Dog() {
	}

	public String getType() {
		logger.info("INFO - This is Dog Class");
		logger.warn("WARN - This is Dog Class");
		logger.debug("DEBUG - This is Dog Class");
		logger.error("ERROR - This is Dog Class");
		return "Carnivore";
	}

	public String eats() {
		return "Meat";
	}

	public int noOfLegs() {
		return 4;
	}

}
