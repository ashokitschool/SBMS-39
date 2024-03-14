package in.ashokit.spec;

import org.springframework.data.jpa.domain.Specification;

import in.ashokit.entity.Product;

public class ProductSpecifications {

	public static Specification<Product> nameLike(String name) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + name + "%");
	}

	public static Specification<Product> priceLessThan(double price) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("price"), price);
	}

	public static Specification<Product> priceGreaterThan(double price) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("price"), price);
	}

}
