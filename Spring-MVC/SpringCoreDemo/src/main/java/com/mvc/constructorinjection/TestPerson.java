package com.mvc.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mvc/constructorinjection/personConfig.xml");
		
		Person p1 = (Person) context.getBean("person1");
		Person p2 = (Person) context.getBean("person2");
		Person p3 = (Person) context.getBean("person3");
		Person p4 = (Person) context.getBean("person4");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}

}
