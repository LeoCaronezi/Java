/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoelevador;
import javax.swing.JOptionPane;
import  modeloelevador.Elevador;
/**
 *
 * @author rafae
 */
public class visaoTesteElevador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Elevador elevador = new Elevador();
       elevador.IniciarElevador();
       elevador.op =Integer.parseInt(JOptionPane.showInputDialog(null, args,"Escolha 1- para entra, "
               + "2- Para subir, 3- Para descer, 4- Sair, 5- sair"));
       while(elevador.op != 6){
       switch (elevador.op){
           case 1: 
               elevador.EntraElevador();
               break;
           case 2: 
               elevador.SubirElevador();
               
               break;
           case 3:
               elevador.SairElevador();
               break;
           case 4:
               elevador.DescerElevador();
               break;
           case 5:
                elevador.FinalizarElevador();
       }
    }
    }
}
