package com.Ecommerce.Nikee.OpenFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ProductService", url = "http://localhost:8082")
public interface ProductClient {

	@PostMapping("/api/cart/init")
    String initializeCartForUser(@RequestParam("userName") String userName);
	
}
