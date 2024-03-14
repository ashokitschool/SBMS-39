package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		ProductService service = context.getBean(ProductService.class);

		// service.saveProducts();

		// service.getProducts();

		service.getProductsSpec(null, 30000.00, 50000.00);
	}

}
