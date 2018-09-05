/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import javax.swing.JOptionPane;

/**
 *
 * @author 20161bsi0527
 */
public class Pontuacao {
    int pontos;
    public void verificarQuestao(Questao novaquestao){
        if(novaquestao.verifica()){
            pontos = pontos+1;
        }
    }
    public void exibirPontuacao(){
        JOptionPane.showInternalMessageDialog(null,"Você fez "+pontos+" pontos");
    }
}
