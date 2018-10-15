package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo2.people;
import pojo2.people2;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext con=new ClassPathXmlApplicationContext("applicationcontext.xml");
        people p=(people) con.getBean("people");
        people2 p2=(people2) con.getBean("people2");
        System.out.println(p);
        System.out.println(p2);
	}

}
