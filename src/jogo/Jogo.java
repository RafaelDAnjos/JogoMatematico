/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;


import javax.swing.JOptionPane;
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int flag = 1;
     String flag2;
     while(flag == 1){
         Questao novapergunta;
         novapergunta = new Questao();
         flag2 = JOptionPane.showInputDialog("Deseja continuar o jogo? 1-Sim 2-Não");
         flag = Integer.parseInt(flag2);
     }
    }
    
}
