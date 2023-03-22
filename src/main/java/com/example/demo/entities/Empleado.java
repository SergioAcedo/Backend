package com.example.demo.entities;

import jakarta.persistence.Entity;

@Entity
public class Empleado extends Usuario{
    private String cargo;
    private Double salario;
}
