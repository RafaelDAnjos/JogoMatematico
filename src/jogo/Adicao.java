/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import javax.swing.JOptionPane;
public class Adicao extends Questao {
    
    public Adicao(){
       
        String resp = JOptionPane.showInputDialog("Quanto é "+operador1+" + "+operador2+"?");
        resposta = Integer.parseInt(resp);
    }

    /**
     *
     * @return
     */
    @Override
    public boolean verifica(){
        return resposta == (operador1+operador2);
    }
}

