package com.paypal.java.spring.logging.app;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.paypal.java.spring.logging.impl.Cow;
import com.paypal.java.spring.logging.impl2.Dog;
import com.paypal.java.spring.logging.impl2.Dolphin;
import com.paypal.java.spring.logging.impl3.Human;

/**
 * Hello world!
 * 
 */
public class MainApp {
	static Logger LOGGER = LoggerFactory.getLogger(MainApp.class);

	public MainApp() {
	}

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Output Starts>>>>>>>>>>>>>>>>>");
		MainApp app = new MainApp();
		app.printHumanMessages(applicationContext);
		app.printDogMessages(applicationContext);
		app.printDolphinMessages(applicationContext);
		app.printCowMessages(applicationContext);

		System.out
				.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Output Ends>>>>>>>>>>>>>>>>>");
	}

	private void printCowMessages(ApplicationContext applicationContext) {
		LOGGER.debug("TEST");
		System.out.println("Cow Messages");
		Cow cowObj = (Cow) applicationContext.getBean("cow");
		System.out.println(cowObj.getType());
		System.out.println(cowObj.eats());
		System.out.println(cowObj.noOfLegs());
		System.out.println("------------------------------------");
	}

	private void printDolphinMessages(ApplicationContext applicationContext) {
		System.out.println("Dolphin Messages");
		Dolphin dolphinObj = (Dolphin) applicationContext.getBean("dolphin");
		System.out.println(dolphinObj.getType());
		System.out.println(dolphinObj.eats());
		System.out.println(dolphinObj.noOfLegs());
		System.out.println("------------------------------------");
	}

	private void printDogMessages(ApplicationContext applicationContext) {
		System.out.println("Dog Messages");
		Dog dogObj = (Dog) applicationContext.getBean("dog");
		System.out.println(dogObj.getType());
		System.out.println(dogObj.eats());
		System.out.println(dogObj.noOfLegs());
		System.out.println("------------------------------------");
	}

	private void printHumanMessages(ApplicationContext applicationContext) {
		System.out.println("Human Messages");
		Human humanObj = (Human) applicationContext.getBean("human");
		System.out.println(humanObj.getType());
		System.out.println(humanObj.eats());
		System.out.println(humanObj.noOfLegs());
		System.out.println("------------------------------------");
	}
}
