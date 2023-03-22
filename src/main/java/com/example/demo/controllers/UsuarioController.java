package com.example.demo.controllers;

import com.example.demo.entities.Product;
import com.example.demo.entities.Usuario;
import com.example.demo.repos.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    UsuariosRepository repository;

    @GetMapping("/{id}")
    public Usuario getProduct(@PathVariable Long id){
        return repository.findById(id).get();
    }
    @GetMapping
    public Iterable<Usuario> getUsuario (){
        return repository.findAll();
    }
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }
    @DeleteMapping
    public void deleteUsuario(@RequestBody Usuario usuario){
        repository.delete(usuario);
    }
    @DeleteMapping("/{id}")
    public void deleteUsuariobyid(@PathVariable Long id){
        repository.deleteById(id);
    }
}
