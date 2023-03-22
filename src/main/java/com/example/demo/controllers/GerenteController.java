package com.example.demo.controllers;

import com.example.demo.entities.Gerente;
import com.example.demo.repos.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gerente")
public class GerenteController {


    @Autowired
    GerenteRepository repository;

    @GetMapping("/{id}")
    public Gerente getGerente(@PathVariable Long id){
        return repository.findById(id).get();
    }
    @GetMapping
    public Iterable<Gerente> getGerente (){
        return repository.findAll();
    }
    @PostMapping
    public Gerente createGerente(@RequestBody Gerente gerente){
        return repository.save(gerente);
    }

    @PutMapping
    public Gerente updateGerente(@RequestBody Gerente gerente){
        return repository.save(gerente);
    }
    @DeleteMapping
    public void deleteGerente(@RequestBody Gerente gerente){
        repository.delete(gerente);
    }
    @DeleteMapping("/{id}")
    public void deleteGerentebyid(@PathVariable Long id){
        repository.deleteById(id);
    }
}
