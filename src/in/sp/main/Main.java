package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello");
		try {
			String config_loc = "/in/sp/resources/applicationContext.xml";
			ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
			Student std = (Student) context.getBean("stdId3");
			System.out.println(std.toString());

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
