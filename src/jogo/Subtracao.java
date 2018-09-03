/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import javax.swing.JOptionPane;
public class Subtracao extends Questao {
    
    public Subtracao(){
        String resp = JOptionPane.showInputDialog("Quanto é "+this.operador1+" - "+this.operador2+" ?");
    }

    /**
     *
     * @return
     */
    @Override
    public boolean verifica(){
   
        return resposta == (operador1-operador2);
    }
}
