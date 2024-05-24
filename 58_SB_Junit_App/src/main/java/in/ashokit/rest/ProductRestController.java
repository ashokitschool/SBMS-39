package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.dto.Product;

@RestController
public class ProductRestController {

	@PostMapping("/product")
	public ResponseEntity<String> saveProduct(@RequestBody Product p) {

		System.out.println(p);

		// logic to save in db

		return new ResponseEntity<>("Product Saved", HttpStatus.CREATED);
	}
}
