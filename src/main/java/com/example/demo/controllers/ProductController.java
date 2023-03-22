package com.example.demo.controllers;

import com.example.demo.entities.Product;
import com.example.demo.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductRepository repository;

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id){
        return repository.findById(id).get();
    }
    @GetMapping
    public Iterable<Product> getProducts (){
        return repository.findAll();
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
      return repository.save(product);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return repository.save(product);
    }
    @DeleteMapping
    public void deleteProduct(@RequestBody Product product){
         repository.delete(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProductbyid(@PathVariable Long id){
        repository.deleteById(id);
    }


}
