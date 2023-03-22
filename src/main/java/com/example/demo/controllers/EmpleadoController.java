package com.example.demo.controllers;

import com.example.demo.entities.Empleado;
import com.example.demo.repos.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoRepository repository;

    @GetMapping("/{id}")
    public Empleado getEmpleado(@PathVariable Long id){
        return repository.findById(id).get();
    }
    @GetMapping
    public Iterable<Empleado> getEmpleado (){
        return repository.findAll();
    }
    @PostMapping
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return repository.save(empleado);
    }

    @PutMapping
    public Empleado updateEmpleado(@RequestBody Empleado empleado){
        return repository.save(empleado);
    }
    @DeleteMapping
    public void deleteEmpleado(@RequestBody Empleado empleado){
        repository.delete(empleado);
    }
    @DeleteMapping("/{id}")
    public void deleteEmpleadobyid(@PathVariable Long id){
        repository.deleteById(id);
    }
}
