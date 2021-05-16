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
public class Principal {
    
    public static void main(String[] args) {
        Estudo estudo = new Estudo();
                
        //estudo.contarIdoso();
        //estudo.faculdade();
        
        Conta conta = new Conta();
        
       // conta.setNome("danilo");
       // System.out.println(conta.getNome());
       
        System.out.println(conta.getNota());
        
    }
}
