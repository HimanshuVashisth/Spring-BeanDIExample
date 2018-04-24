package com.baeldung.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baeldung.model.Person;

public class DITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanConfig.xml");
		
		Person person = (Person) applicationContext.getBean("person");
		person.fetchPersonAddress();
	}

}
