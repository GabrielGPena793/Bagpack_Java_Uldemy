package com.uldemy.entities;

public class PessoaFisica extends Pessoa{

    private Double gastosSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double calculoImposto() {

        double imposto = getRendaAnual() < 20000.00 ? getRendaAnual() * 15 /100 : getRendaAnual() * 25 /100;

        double valorAbatido = gastosSaude > 0 ? gastosSaude * 50 / 100 : 0;

        return imposto - valorAbatido;
    }


}
