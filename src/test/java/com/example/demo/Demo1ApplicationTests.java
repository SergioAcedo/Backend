package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Product;
import com.example.demo.repos.ProductRepository;

@SpringBootTest
class Demo1ApplicationTests {

	@Autowired
	ApplicationContext applicationContext;
	
	@Test
	void test() {
		ProductRepository repository = applicationContext.getBean(ProductRepository.class);
		Product entity = new Product();
		entity.setId(2L);
		entity.setName("MAC");
		entity.setDescription("Lucky");
		entity.setPrice(1500d);
		repository.save(entity);
		
	}

}
