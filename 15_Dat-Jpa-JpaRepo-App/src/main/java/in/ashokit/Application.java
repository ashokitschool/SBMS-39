package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		
		EmpService empService = context.getBean(EmpService.class);
		
		//empService.getAllEmps();
		// empService.getAllEmpsSort();
		// empService.getAllEmpsPagination();
		empService.getAllEmpsWithFilter();
	}

}
