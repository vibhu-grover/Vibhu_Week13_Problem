package com.SpringDriver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Teacher;
import com.serviceImpl.HindiTeacher;

public class Driver {

	public static void main(String[] args) {
		//1. configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//2. Retrieve bean from spring
		Teacher teacher = context.getBean("hindiTeacher",HindiTeacher.class);
		
		//3. call method on a bean
		System.out.println(teacher.getHomework());
		
		//4. close the context
        context.close();
	}

}
