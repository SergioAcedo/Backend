package com.example.demo.entities;

import jakarta.persistence.Entity;
@Entity
public class Gerente extends Usuario{


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    private String cargo;
    private Double salario;


}
