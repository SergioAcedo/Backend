package com.example.demo.repos;


import com.example.demo.entities.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
}
