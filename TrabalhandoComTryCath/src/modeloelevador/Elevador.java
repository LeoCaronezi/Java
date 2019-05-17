/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloelevador;
import javax.swing.*;

/**
 *
 * @author rafael caronezi
 */
public class Elevador {
    //variaveis para manipular o andar:
    public int andar, andarAtual,andarDesejado;
    //variaveis para manipular as pessoa que iram entra
        public int capacidade, pessoasAentrar,pessoas,pessoasAsair;
    //variavel para controle de funcionalidade;
        public int op;
    public void IniciarElevador(){
        andar =0;
        pessoas=0;
        JOptionPane.showMessageDialog(null, "Seja bem vindos");
     capacidade=Integer.parseInt(
                 JOptionPane.showInputDialog("Informa a capacidade maxima de pessoas no elevador"));
    }
    public void EntraElevador(){
        
      if ((pessoasAentrar+pessoas)<=capacidade){
            pessoas += pessoasAentrar;
      }
      else{
                  JOptionPane.showInputDialog("limite de pessoa alcançada");    

      }
}
    public void SubirElevador(){
        if (andarAtual<andarDesejado){
            andarAtual = andarDesejado;
            JOptionPane.showInputDialog("O elevador esta subindo");
            JOptionPane.showInputDialog("O elevador chegou"+andarAtual);
        }
    }
    public void SairElevador(){
        if((pessoas-pessoasAsair)!= 0){
    }
    
}
    public void DescerElevador(){
       if(andarAtual>andarDesejado){
        andarAtual = andarDesejado;
        JOptionPane.showInputDialog("O elevador esta Descendo");
        JOptionPane.showInputDialog("O elevador chegou" +andarAtual);
       }  
    }
    //funcionando corretamente 
    public void FinalizarElevador(){
        op = 6;
    }
    
}