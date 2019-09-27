package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("ex_init.xml");
//		MyProcess myProcess = (MyProcess)context.getBean("myProcess");
		
		// Config 사용시 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MyProcess myProcess = (MyProcess)context.getBean("myProcess");
		
		myProcess.Show();
		System.out.println(myProcess);
	}
}
