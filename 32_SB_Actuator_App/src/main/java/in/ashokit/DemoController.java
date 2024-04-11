package in.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@GetMapping("/welcome")
	@ResponseBody
	public String welcomeMsg() {
		return "Welcome to Spring Boot";
	}
}
