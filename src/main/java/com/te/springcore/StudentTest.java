package com.te.springcore;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.spring.Student;

public class StudentTest
{
	public static void main(String[] args) 
	{
		ApplicationContext contex=new ClassPathXmlApplicationContext("student.xml");
		 Student student=(Student) contex.getBean("student");
		 System.out.println(student.getSid());
		 System.out.println(student.getSname());
		 System.out.println(student.getSchool().getName());
		 
		 
//		 Scanner sc=new Scanner(System.in);
//			
//			
//			
//			System.out.println("enter id");
//			student.setId(Integer.parseInt(sc.nextLine()));
//			System.out.println("enter name");
//			student.setName(sc.nextLine());
//			System.out.println(student.getId());
//			System.out.println(student.getName());
			

	}

}
