package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.User;
import jakarta.validation.Valid;

@Controller
public class UserController {

	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/user")
	public String handleSubmit(@Valid User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			// validation failed
			return "index";
		} else {
			// validation passed
			System.out.println(user);
			// logic to save in db
			model.addAttribute("msg", "User Saved");
			return "index";
		}
	}
}
