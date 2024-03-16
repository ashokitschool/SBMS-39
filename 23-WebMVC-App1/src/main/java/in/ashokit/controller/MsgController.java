package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/greet")
	public ModelAndView getMsg2() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg2", "Good Morning...!!");
		mav.setViewName("index");

		return mav;
	}

	@GetMapping("/welcome")
	public ModelAndView getMsg1() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg1", "Welcome to Ashok IT");
		mav.setViewName("index");
		return mav;
	}
}
