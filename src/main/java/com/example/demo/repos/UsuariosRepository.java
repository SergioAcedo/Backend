package com.example.demo.repos;

import com.example.demo.entities.Product;
import com.example.demo.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepository extends CrudRepository<Usuario, Long> {
}
