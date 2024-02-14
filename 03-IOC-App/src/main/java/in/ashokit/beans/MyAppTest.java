package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring-beans.xml");
		
		RestaurantService rs1 = 
				context.getBean(RestaurantService.class);
		
		rs1.processPayment(1200.00);
		
		//RestaurantService rs2 = (RestaurantService) context.getBean("rs");
		
	}
}
