package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Product;
import in.ashokit.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	// load form - GET
	@GetMapping("/")
	public ModelAndView loadForm() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("pobj", new Product());// for form binding
		mav.setViewName("index");
		return mav;
	}

	// save product - POST
	@PostMapping("/product")
	public ModelAndView saveProduct(Product pobj) {
		ModelAndView mav = new ModelAndView();

		boolean status = productService.saveProduct(pobj);
		if (status) {
			mav.addObject("smsg", "Product Saved");
		} else {
			mav.addObject("emsg", "Failed to save");
		}

		mav.addObject("pobj", new Product());// for form binding
		mav.setViewName("index");
		return mav;
	}

	// get products - GET
	@GetMapping("/products")
	public ModelAndView viewProducts() {
		List<Product> productsList = productService.getAllProducts();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("plist", productsList);
		mav.setViewName("data");

		return mav;
	}
}






