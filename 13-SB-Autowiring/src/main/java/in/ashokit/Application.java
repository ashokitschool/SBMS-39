package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.beans.Robot;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		Robot robot1 = context.getBean(Robot.class);
		System.out.println(robot1.hashCode());

		Robot robot2 = context.getBean(Robot.class);
		System.out.println(robot2.hashCode());
	}

}
