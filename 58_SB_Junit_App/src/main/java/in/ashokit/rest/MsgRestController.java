package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.MsgService;

@RestController
public class MsgRestController {

	@Autowired
	private MsgService msgService;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String welcomeMsg = msgService.getWelcomeMsg();
		welcomeMsg = welcomeMsg.toUpperCase();
		return welcomeMsg;
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		String greetMsg = msgService.getGreetMsg();
		greetMsg = greetMsg.toLowerCase();
		return greetMsg;
	}

}
