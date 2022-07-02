package com.chainsys.springproject.startup;


import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chainsys.springproject.view.EmployeeController;

public class Main {

	public static void main(String[] args) {
	employeeMenu();
	}
	public static void employeeMenu() {
		ConfigurableApplicationContext apcontext=new ClassPathXmlApplicationContext("Employee.xml");
		EmployeeController ctrl = apcontext.getBean(EmployeeController.class);
		Scanner sc=new Scanner(System.in);
		ctrl.setcontext(apcontext);
		ctrl.setSc(sc);
		System.out.println(
				"Enter Employee Method : 1=addEmployee, 2=getEmployeeById ,3=upadateEmployee ,4=deleteEmployee");
		int vCase=sc.nextInt();
		switch(vCase) {
		case 1:
			ctrl.addNewEmployee();
			break;
		case 2:
			ctrl.GetEmplyeeById();
			break;
		case 3:
			ctrl.UpdateEmployee();
			break;
		case 4:
			ctrl.DeleteEmployee();
			break;
		default:
			System.out.println("enter valid number");
		}
		apcontext.close();
		sc.close();
	
	}
}