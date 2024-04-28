package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.clients.WelcomeApiFeignClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeApiFeignClient welcomeClient;

	@Autowired
	private Environment env;

	@GetMapping("/greet")
	public String greetMsg() {

		String welcomeResp = welcomeClient.invokeWelcomeApi();

		String port = env.getProperty("server.port");

		String greetResp = "Good Morning (" + port + "), ";

		return greetResp + welcomeResp;
	}
}
