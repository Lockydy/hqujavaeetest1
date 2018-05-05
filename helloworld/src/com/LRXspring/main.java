package com.LRXspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext tim=new ClassPathXmlApplicationContext("Beans.xml");  
        helloworld timer=(helloworld) tim.getBean("hello");   
        timer.getMessage();  
	}

}