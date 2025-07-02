package com.Ecommerce.Nikee;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EcommerceNikee01RegistrationLoginApplication {


	public static void main(String[] args) {
		SpringApplication.run(EcommerceNikee01RegistrationLoginApplication.class, args);
	}

}
