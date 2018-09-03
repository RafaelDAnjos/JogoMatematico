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
    
    
    this.opcao = ThreadLocalRandom.current().nextInt(0,3);
        if(this.opcao == 0){
            Adicao novaquestao;
            novaquestao = new Adicao(operador1,operador2,resposta);
            this.flag = novaquestao.verifica();
        }else if(this.opcao == 1){
            Subtracao novaquestao;
            novaquestao = new Subtracao();
            this.flag = novaquestao.verifica();
        }else if(this.opcao == 2){
            Multiplicacao novaquestao;
            novaquestao = new Multiplicacao();
            this.flag = novaquestao.verifica();
    
}
