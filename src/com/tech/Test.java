package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {


		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		 Employee e1= (Employee) ctx.getBean("ee1");
		 
		 System.out.println(e1.getName());
		 
        Employee e2= (Employee) ctx.getBean("ee2");
		 
		 System.out.println(e2.getId());
		 

	}

}
