package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	public void saveProduct() {

		Product p = new Product();
		
		p.setName("HDD");
		p.setPrice(9000.00);
		
		productRepo.save(p);

		System.out.println("Product saved...");

	}
}





