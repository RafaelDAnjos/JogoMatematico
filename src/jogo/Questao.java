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
public abstract class Questao {
    
     int pontos;
     int opcao;
     int operador1;
     int operador2;
     int resposta;
    
    public Questao(){
        operador1 = ThreadLocalRandom.current().nextInt(0,20);
        operador2 = ThreadLocalRandom.current().nextInt(0,20);
        
    }
    public abstract boolean verifica();
    public  void ExibirResposta(){
        if(this.verifica()){
            JOptionPane.showInternalMessageDialog(null,"Você Acertou!");
        }else{
            JOptionPane.showInternalMessageDialog(null,"Você Errou!");
        }
    
    }
  

}
