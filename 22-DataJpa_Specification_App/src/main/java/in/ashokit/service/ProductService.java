package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;
import in.ashokit.spec.ProductSpecifications;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;

	public void getProductsSpec(String name, Double minPrice, Double maxPrice) {

		Specification<Product> spec = Specification.where(null);

		if (name != null) {
			spec = spec.and(ProductSpecifications.nameLike(name));
		}

		if (minPrice != null) {
			spec = spec.and(ProductSpecifications.priceGreaterThan(minPrice));
		}

		if (maxPrice != null) {
			spec = spec.and(ProductSpecifications.priceLessThan(maxPrice));
		}

		List<Product> findAll = repo.findAll(spec);
		findAll.forEach(System.out::println);

	}

	public void getProducts() {

		Product p = new Product();
		p.setCategory("Mobiles");
		p.setPrice(10000.00);

		Example<Product> of = Example.of(p);

		List<Product> findAll = repo.findAll(of);
		findAll.forEach(System.out::println);
	}

	public void saveProducts() {
		Product p1 = new Product();
		p1.setCategory("Mobiles");
		p1.setName("Samsung");
		p1.setPrice(10000.00);

		Product p2 = new Product();
		p2.setCategory("Mobiles");
		p2.setName("Apple");
		p2.setPrice(50000.00);

		Product p3 = new Product();
		p3.setCategory("Mobiles");
		p3.setName("MI");
		p3.setPrice(30000.00);

		Product p4 = new Product();
		p4.setCategory("Mobiles");
		p4.setName("OPPO");
		p4.setPrice(40000.00);

		repo.saveAll(Arrays.asList(p1, p2, p3, p4));

	}

}
