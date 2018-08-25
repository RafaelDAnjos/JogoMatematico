/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
public class Subtracao {
    private int operador1;
    private int operador2;
    private String resposta;
    public Subtracao(){
        this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
        this.operador2 = ThreadLocalRandom.current().nextInt(0,100);
        this.resposta = JOptionPane.showInputDialog("Quanto é "+this.operador1+" - "+this.operador2+" ?");
    }
    public boolean verifica(){
        int resp = Integer.parseInt(this.resposta);
        if(resp == (this.operador1-this.operador2)){
            JOptionPane.showMessageDialog(null,"Você Acertou!");
            return true;
        }else{
            JOptionPane.showMessageDialog(null,"Você Errou!");
            return false;
        }
    }
}
