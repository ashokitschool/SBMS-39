package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.bindings.Book;

@Controller
public class BookController {

	// method-1 : to load form (GET)
	@GetMapping("/book")
	public ModelAndView loadForm() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("bookObj", new Book());
		mav.setViewName("bookView");

		return mav;
	}

	// method-2 : to handle form submission (POST)
	@PostMapping("/book")
	public ModelAndView handleBookSubmit(Book book) {

		System.out.println(book);
		// Todo : save data into db

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Book Saved successfully...");
		mav.setViewName("success");
		return mav;

	}

}
