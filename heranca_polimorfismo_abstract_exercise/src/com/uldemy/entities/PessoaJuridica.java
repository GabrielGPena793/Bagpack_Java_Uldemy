package com.uldemy.entities;

public class PessoaJuridica extends Pessoa {

    private Integer numeroFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double calculoImposto() {

        return numeroFuncionarios > 10 ? getRendaAnual() * 14 / 100 : getRendaAnual() * 16 / 100;
    }

}
