package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.ashokit.exception.ProductNotFoundException;

@Controller
public class ProductController {

	@GetMapping("/product/{pid}")
	public String getProduct(@PathVariable("pid") Integer pid, Model model) throws Exception {

		if (pid >= 100) {
			throw new ProductNotFoundException("Invalid Product Id");
		} else {
			model.addAttribute("msg", "Product Name : Apple Mobile");
		}

		return "index";
	}
}
