package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext o=new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService ser=o.getBean(EmployeeService.class);
		ser.addEmployee();
		ser.displayEmployee();
		ser.calculateSalary();
	}
}
