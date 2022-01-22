package com.uldemy.entities;

public class Employee {

    private Integer id;
    private String nome;
    private Double salario;

    public Employee(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

   public void aumentoSalario(Double porcetagem){
        this.salario += salario * porcetagem / 100;
   }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
