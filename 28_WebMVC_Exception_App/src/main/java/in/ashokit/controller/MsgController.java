package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

	@GetMapping("/greet")
	public String getGreet(Model model) {
		model.addAttribute("msg", "Good Morning...");
		return "index";
	}

	@GetMapping("/welcome")
	public String getWelcome(Model model) {
		int i = 10 / 0; //AE
		model.addAttribute("msg", "Welcome to Ashok IT");
		return "index";
	}

}










