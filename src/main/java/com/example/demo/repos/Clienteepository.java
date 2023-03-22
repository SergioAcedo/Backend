package com.example.demo.repos;

import com.example.demo.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface Clienteepository extends CrudRepository<Cliente, Long> {
}
