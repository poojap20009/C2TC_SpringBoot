package com.cg.College;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student student = c.getBean("s", Student.class);
		student.display();
		
		Student student1 = c.getBean("s1", Student.class);
		student1.display();
	}

}
