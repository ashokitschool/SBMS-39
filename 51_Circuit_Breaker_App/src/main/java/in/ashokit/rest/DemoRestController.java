package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DemoRestController {

	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDB", name = "ashokit")
	public String getDataFromRedis() {
		System.out.println("**** redis() - method executed....");
		// logic to connect with redis
		int i = 10/0;
		return "Data Fetched From Redis Server";
	}
	
	public String getDataFromDB(Throwable t) {
		System.out.println("**** db() - method executed....");
		// logic to connect with db
		return "Data Fetched From DB Server";
	}
}
