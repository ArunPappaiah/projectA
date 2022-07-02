package com.chainsys.springproject.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chainsys.springproject.autowire.Car;
import com.chainsys.springproject.autowire.CarServices;
import com.chainsys.springproject.beans.Actor;
import com.chainsys.springproject.beans.Calendar;
import com.chainsys.springproject.beans.Customer;
import com.chainsys.springproject.beans.Employee;
import com.chainsys.springproject.beans.Lunch;
import com.chainsys.springproject.beans.ScoreBoard;
import com.chainsys.springproject.lifecycle.AnnotationLc;
import com.chainsys.springproject.lifecycle.InitDesposeBean;
import com.chainsys.springproject.lifecycle.LifeCycleBean;

public class TestClassPathXml {
	public static void testA() {
		Employee emp = new Employee();
		emp.setId(250);
		emp.setName("Berlin");
		emp.print();
	}

	public static void testB() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		// Employee emp1 = ac.getBean(Employee.class); // overloaded method of
		// getBean(Class) returns object of the Class Employee Type casting not required
		Employee emp = (Employee) ac.getBean("emp"); // overloaded method of getBean(String) returns Object, type
														// casting is required
		emp.setId(350);
		emp.setName("Kalai");
		emp.print();
		Customer c = ac.getBean(Customer.class);
		c.setId(222);
		c.setName("Elon");
		c.print();
	}

	public static void testLazyInit() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = ac.getBean(Employee.class);
		Customer c = ac.getBean(Customer.class);
		Employee secondemp = ac.getBean(Employee.class);
		Customer secondcus = ac.getBean(Customer.class);
		System.out.println(emp.hashCode());
		System.out.println(secondemp.hashCode());
		System.out.println(c.hashCode());
		System.out.println(secondcus.hashCode());
	}

	public static void testProtoType() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

		Actor hero = ac.getBean(Actor.class);
		Actor heroin = ac.getBean(Actor.class);
		Actor comedian = ac.getBean(Actor.class);
		Actor friend = ac.getBean(Actor.class);
		System.out.println(hero.hashCode());
		System.out.println(heroin.hashCode());
		System.out.println(comedian.hashCode());
		System.out.println(friend.hashCode());

	}

	public static void testBeanWithConstructor() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	}

	public static void testFactoryMethod() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		ScoreBoard sb = ac.getBean("sb1", ScoreBoard.class);
		sb.targetScore = 183;
		System.out.println(sb.targetScore);
		ScoreBoard sb2 = ac.getBean("sb2", ScoreBoard.class);
		System.out.println(sb2.targetScore);
	}

	public static void testCalendarfactory() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Calendar today = ac.getBean(Calendar.class);
		today.day = 9;
		today.month = "june";
		today.year = 2022;
		System.out.println("Day: " + today.day);
		System.out.println("Month: " + today.month);
		System.out.println("Year: " + today.year);
	}

	public static void testLunchFactory() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Lunch.xml");
		Lunch nvsilunch = ac.getBean("nvsilunch", Lunch.class);
		Lunch vsilunch = ac.getBean("vsilunch", Lunch.class);
		Lunch nilunch = ac.getBean("nilunch", Lunch.class);
		Lunch chlunch = ac.getBean("chlunch", Lunch.class);
		System.out.println("---------");
		nvsilunch.serve();
		System.out.println("---------");
		vsilunch.serve();
		System.out.println("---------");
		nilunch.serve();
		System.out.println("---------");
		chlunch.serve();
	}
	public static void testSetterDi() {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = ac1.getBean("emp2",Employee.class);
		emp.print();
	}
	public static void testLifeCycle() {
		ConfigurableApplicationContext ac1 = new ClassPathXmlApplicationContext("Lc.xml");
		LifeCycleBean lcb = ac1.getBean(LifeCycleBean.class);
		lcb.print();
	//	LifeCycleBean lcb1 = ac1.getBean(LifeCycleBean.class);
	//	LifeCycleBean lcb2 = ac1.getBean(LifeCycleBean.class);
		lcb = null;
		ac1.close();
		ac1 = null;
	//	System.gc();
	}
	public static void testInitDestroyBean() {
		ConfigurableApplicationContext ac1 = new ClassPathXmlApplicationContext("Lc.xml");
		InitDesposeBean idb = ac1.getBean(InitDesposeBean.class);
		idb.print();
		idb.close();
	}
	public static void testAnnotationLc() {
		ConfigurableApplicationContext ac1 = new ClassPathXmlApplicationContext("Lc.xml");
		AnnotationLc ann = ac1.getBean(AnnotationLc.class);
		ann.print();
		ann = null;
		ac1.close();
	}
	public static void testAutoWire() {
		ConfigurableApplicationContext ac1 = new ClassPathXmlApplicationContext("Autowire.xml");
		Car car= ac1.getBean("car",Car.class);
		car.start();
		car.move();
		car = null;
		ac1.close();
	}
	public static void testAutowireQualifier() {
		ConfigurableApplicationContext ac1 = new ClassPathXmlApplicationContext("Autowire.xml");
		CarServices cs = ac1.getBean(CarServices.class);
		cs.startTrip();
	}
}
