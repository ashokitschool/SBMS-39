package in.ashokit;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		Engine engine = context.getBean(Engine.class);
		
		engine.doWork();
		
		context.close();
	}
}
