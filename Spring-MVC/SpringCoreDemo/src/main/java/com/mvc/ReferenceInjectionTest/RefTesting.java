package com.mvc.ReferenceInjectionTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mvc.ReferenceInjection.Object1;

public class RefTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mvc/ReferenceInjectionTest/RefConfigTest.xml");
		StudentDetails temp = (StudentDetails) context.getBean("sd1");
		System.out.println(temp.getStudentName());
		System.out.println(temp.getStudentClass());
		System.out.println(temp.getStudentAge());
		System.out.println(temp.getStudentCity());
		
		System.out.println(temp.getSs().getSubject1());
		System.out.println(temp.getSs().getSubject2());
		System.out.println(temp.getSs().getSubject3());
		System.out.println(temp.getSs().getSubject4());

	}

}
