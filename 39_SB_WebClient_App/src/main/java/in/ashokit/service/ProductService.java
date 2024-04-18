package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Product;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	
	public Mono<Product> getProductNew(){
		
		String apiUrl = "https://api.restful-api.dev/objects/1";
		
		WebClient webclient = WebClient.create();
		
		 return webclient.get()
						 .uri(apiUrl)
						 .retrieve()
						 .bodyToMono(Product.class);
		
	}

	public Mono<String> getProduct() {

		String apiUrl = "https://api.restful-api.dev/objects/1";

		// getting webclient impl class obj
		WebClient webClient = WebClient.create();
		
        Mono<String> bodyToMono = webClient.get() // send GET req
										   .uri(apiUrl) // provider url
										   .retrieve() // get response body
										   .bodyToMono(String.class); // map response
		
		return bodyToMono;
	}

}






