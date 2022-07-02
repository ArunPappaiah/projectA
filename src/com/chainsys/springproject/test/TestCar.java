package com.chainsys.springproject.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chainsys.springproject.beans.Car;

public class TestCar {
	public static void firstTest() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Car2.xml");
		Car c = ac.getBean("jaguar",Car.class);
		c.start();
        c.move();		
	}
}
