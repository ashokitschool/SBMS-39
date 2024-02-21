package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		
		Student s = context.getBean(Student.class);
		
		System.out.println(s);//toString()
		System.out.println(s.hashCode());
	}
}
