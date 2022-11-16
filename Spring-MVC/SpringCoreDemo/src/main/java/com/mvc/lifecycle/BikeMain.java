package com.mvc.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/mvc/lifecycle/config.xml");

		Motorbike mb = (Motorbike) context.getBean("motorbike1");
		System.out.println(mb);
		context.registerShutdownHook();

	}

}
