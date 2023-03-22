package com.example.demo.controllers;

import com.example.demo.entities.Servicio;
import com.example.demo.repos.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("servicio")
public class ServicioController {

    @Autowired
    ServicioRepository repository;

    @GetMapping("/{id}")
    public Servicio getServicio(@PathVariable Long id){
        return repository.findById(id).get();
    }
    @GetMapping
    public Iterable<Servicio> getServicio(){
        return repository.findAll();
    }
    @PostMapping
    public Servicio createServicio(@RequestBody Servicio servicio){
        return repository.save(servicio);
    }

    @PutMapping
    public Servicio updateServicio(@RequestBody Servicio servicio){
        return repository.save(servicio);
    }
    @DeleteMapping
    public void deleteServicio(@RequestBody Servicio servicio){
        repository.delete(servicio);
    }
    @DeleteMapping("/{id}")
    public void deleteServiciobyid(@PathVariable Long id){
        repository.deleteById(id);
    }
}
