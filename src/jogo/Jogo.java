/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author 20161bsi0527
 */
public class Jogo {
    int opcao;
    Pontuacao ponto;
    public void iniciaJogo(){
            
        opcao = ThreadLocalRandom.current().nextInt(0,3);
        Questao novaquestao = null;
        ponto = new Pontuacao();
        int flag = 0;
        while(flag == 0){
        if(opcao == 0){
        
            novaquestao = new Adicao();
            
        }else if(opcao == 1){
            
            novaquestao = new Subtracao();
            
        }else if(opcao == 2){
            
            novaquestao = new Multiplicacao();
           
        }
        novaquestao.exibirResposta();
        ponto.verificarQuestao(novaquestao);
        flag = JOptionPane.showConfirmDialog(null,"quer continuar o jogo? ");
            }
        ponto.exibirPontuacao();
    }
}