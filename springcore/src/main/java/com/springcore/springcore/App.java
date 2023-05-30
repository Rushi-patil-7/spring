package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.admin.Admin;
import com.springcore.springcore.student.Student;
import com.springcore.teacher.Teacher;
import com.springcore.test.Test;

public class App 
{
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Student student1 =(Student) context.getBean("student1"); 
    	Teacher teacher1 = (Teacher) context.getBean("teacher1");
    	
    	Admin admin1 = (Admin) context.getBean("admin1");


    	AbstractApplicationContext abcontex = new ClassPathXmlApplicationContext("config.xml");
    	Test subject =(Test) context.getBean("subject");
    	
    	System.out.println(student1);
    	System.out.println(teacher1);
    	
    	System.out.println(admin1);
    	
    	System.out.println("Admin1 Plot no is" +admin1.getPtno().getPlotno());
    	System.out.println(subject);
    	abcontex.registerShutdownHook();
    	
    
    	
    }
    
}
