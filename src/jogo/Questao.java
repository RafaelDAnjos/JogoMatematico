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
 * @author rafael
 */
public class Questao {
    private int opcao;
    public Questao(){
        this.opcao = ThreadLocalRandom.current().nextInt(0,3);
        if(this.opcao == 0){
            Adicao novaquestao;
            novaquestao = new Adicao();
            novaquestao.verifica();
        }else if(this.opcao == 1){
            Subtracao novaquestao;
            novaquestao = new Subtracao();
            novaquestao.verifica();
        }else if(this.opcao == 2){
            Multiplicacao novaquestao;
            novaquestao = new Multiplicacao();
            novaquestao.verifica();
    }
    }
}
