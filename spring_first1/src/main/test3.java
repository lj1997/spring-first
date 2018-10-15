package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo1.stu1;
import pojo2.people;
import pojo2.people2;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ApplicationContext con=new ClassPathXmlApplicationContext("applicationcontext2.xml");
	        stu1 s=con.getBean(stu1.class);
	        System.out.println(s);
	        
	}

}
