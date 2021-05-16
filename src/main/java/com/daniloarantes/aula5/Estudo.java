/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniloarantes.aula5;

import javax.swing.JOptionPane;

/**
 *
 * @author Danilo Arantes <danilo at daniloarantes.com>
 */
public class Estudo {
    
    public void contarIdoso(){
        String sexo = JOptionPane.showInputDialog("Digite o sexo:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        int idosos = 0;
        
        if (!("masculino".equals(sexo) && idade >= 65)) {
            idosos++;
        }
        
        JOptionPane.showMessageDialog(null, idosos);
    }
    
    
    public void faculdade(){
        int mediaSemestre = 90;
        int provaFinal = 70;
        
        
        if ((mediaSemestre >= 90) || (provaFinal >=90)) {
            JOptionPane.showMessageDialog(null, "Aluno Aprovado");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno Reprovado");
        }
    }
    
}
