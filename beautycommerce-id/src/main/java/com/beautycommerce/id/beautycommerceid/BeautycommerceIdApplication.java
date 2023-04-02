package com.beautycommerce.id.beautycommerceid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
//@EnableWebMvc
public class BeautycommerceIdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeautycommerceIdApplication.class, args);
	}

}
