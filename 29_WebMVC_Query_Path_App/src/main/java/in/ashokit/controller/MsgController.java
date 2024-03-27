package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {

	@GetMapping("/welcome")
	@ResponseBody
	public String welcomeMethod(@RequestParam("name") String name) {
		return name + ", Welcome to Ashok IT";
	}

	@GetMapping("/greet/{name}")
	public String greetMethod(@PathVariable("name") String name, Model model) {
		model.addAttribute("msg", name+", Good Morning");
		return "index";
	}
}






