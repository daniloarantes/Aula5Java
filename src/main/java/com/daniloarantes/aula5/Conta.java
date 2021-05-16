/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniloarantes.aula5;

/**
 *
 * @author Danilo Arantes <danilo at daniloarantes.com>
 */
public class Conta {

    private String nome;
    private double nota = 10;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    /**
     * @return the nota
     */
    public String getNota() {
        if (nota <=10 && nota >=9) {
            return "A";
        }else if(nota <=8 && nota >=7){
            return "B";
        } else if(nota <=6 && nota >=5) {
            return "C";
        } else {
            return "Reprovado";
        }
    }

    
    
    

}
