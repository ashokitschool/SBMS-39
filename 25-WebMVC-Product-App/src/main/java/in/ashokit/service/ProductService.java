package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Product;

public interface ProductService {

	public boolean saveProduct(Product p);

	public List<Product> getAllProducts();

}
