package org.antwalk;

import java.util.Scanner;

import org.antwalk.classes.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer c = context.getBean(Customer.class);
		
	}

}
