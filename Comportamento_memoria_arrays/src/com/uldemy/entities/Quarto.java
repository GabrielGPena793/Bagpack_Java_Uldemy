package com.uldemy.entities;

public class Quarto {

    private Estudante[] estudantes = new Estudante[10];

    public void addEstudante(int quarto, Estudante estudante){
        estudantes[quarto] = estudante;
    }

    public void quartosAlugados(){

        for (int i = 0; i < estudantes.length; i++){
            if (estudantes[i] != null){
                System.out.println(i + " : " + estudantes[i].getNome() + ", " + estudantes[i].getEmail());
            }
        }
    }



}
