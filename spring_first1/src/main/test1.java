package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pojo1.config;
import pojo1.school;
import pojo1.stu1;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext app=new AnnotationConfigApplicationContext(config.class);
        stu1 s= app.getBean(stu1.class);
        school sh=app.getBean(school.class);
        System.out.println(s);
        System.out.println(sh);
	}

}
