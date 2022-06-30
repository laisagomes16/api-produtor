package com.api.produtor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdutorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutorApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "Laisa passo!!";
	}
}
