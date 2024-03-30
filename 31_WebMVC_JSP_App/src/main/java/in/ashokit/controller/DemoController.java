package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String welcome(Model model) {
		model.addAttribute("msg", "Good Morning..!!");
		return "index";
	}

}
