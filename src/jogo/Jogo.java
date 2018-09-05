/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author 20161bsi0527
 */
public class Jogo {
    int opcao;
    public Jogo(){
    opcao = ThreadLocalRandom.current().nextInt(0,3);
        if(this.opcao == 0){
            Adicao novaquestao;
            novaquestao = new Adicao();
            novaquestao.ExibirResposta();
        }else if(this.opcao == 1){
            Subtracao novaquestao;
            novaquestao = new Subtracao();
            novaquestao.ExibirResposta();
        }else if(this.opcao == 2){
            Multiplicacao novaquestao;
            novaquestao = new Multiplicacao();
            novaquestao.ExibirResposta();
        }
}
}