package com.example.demo.controllers;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Empleado;
import com.example.demo.repos.Clienteepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    Clienteepository repository;

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id){
        return repository.findById(id).get();
    }
    @GetMapping
    public Iterable<Cliente> getCliente (){
        return repository.findAll();
    }
    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }

    @PutMapping
    public Cliente updateCliente(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }
    @DeleteMapping
    public void deleteCliente(@RequestBody Cliente cliente){
        repository.delete(cliente);
    }
    @DeleteMapping("/{id}")
    public void deleteClientebyid(@PathVariable Long id){
        repository.deleteById(id);
    }
}
