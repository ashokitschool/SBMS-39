package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.bindings.User;

@Controller
public class UserController {

	@GetMapping("/user")
	public ModelAndView loadForm() {

		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userObj", new User());
		mav.setViewName("index");

		return mav;
	}
	
	@PostMapping("/user")
	public ModelAndView handleUserFormSubmit(User user) {
		
		System.out.println(user);
		//TODO: save data in db
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "User Details Saved");
		mav.setViewName("success");
		
		return mav;
	}
	
}
