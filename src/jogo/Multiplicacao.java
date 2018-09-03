/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Multiplicacao extends Questao {
    
    public Multiplicacao(){
        String resp = JOptionPane.showInputDialog("Quanto é "+this.operador1+" X "+this.operador2+" ?");
        resposta = Integer.parseInt(resp);
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean verifica(){
        
        return resposta == (operador1*operador2);
    }
}

