package com.tyss.springcore.usignxml.assingnement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.beansclass.Student;

public class ManiClass1 {

	public static void main(String[] args) {

		ApplicationContext context = new  ClassPathXmlApplicationContext("student.xml");
		Student student= (Student) context.getBean("studentOne");
		System.out.println(student.getSid());
		System.out.println(student.getSname());
		System.out.println(student.getAddress().getPinNum());
		System.out.println(student.getAddress().getHno());
		System.out.println(student.getAddress().getState());
		
		
	}

}
