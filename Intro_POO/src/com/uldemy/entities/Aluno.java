package com.uldemy.entities;

public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double notaFinal(){
        return this.nota1 + this.nota2 + this.nota3;
    }

    public void resultado(){

        if (notaFinal() >= 60)
            System.out.printf("FINAL GRADE = %.2f %nPASS", notaFinal());
        else{
            System.out.printf("FINAL GRADE = %.2f %nFAILED %nMISSSING %.2f POINTS", notaFinal(), (60 - notaFinal()));

        }
    }


}
