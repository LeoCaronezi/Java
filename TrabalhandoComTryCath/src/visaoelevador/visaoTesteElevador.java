/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoelevador;
import javax.swing.JOptionPane;
import  modeloelevador.Elevador;
import java.util.Scanner;
/**
 *
 * @author rafael caronezi11
 */
public class visaoTesteElevador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner  leitor = new Scanner (System.in);
       Elevador elevador = new Elevador();
       elevador.IniciarElevador();
       System.out.println("informe a qauntidade de andares:");
       elevador.andar= Integer.parseInt(leitor.nextLine());
       System.out.println("Escolha 1- para entra, 2- para subir,3- para sair "
               + "4- para descer, 5- para sair");
       
       elevador.op=Integer.parseInt(leitor.nextLine());
       
       //corrigir caixa de texto
     /*  elevador.op =Integer.parseInt(JOptionPane.showInputDialog(null, args,"Escolha 1- para entra, "
               + "2- Para subir, 3- Para descer, 4- Sair, 5- sair")); */
       
     
           //entra no elevador:
           if(elevador.op==1) {
               System.out.println("informe pessoas a entra no elevador:");
               elevador.pessoasAentrar = Integer.parseInt(leitor.nextLine());
               elevador.EntraElevador();
               elevador.op=Integer.parseInt(leitor.nextLine());
                
           }
               
            //subir elevador: 
           if (elevador.op==2) { 
               System.out.println("Informe o andar desejado:");
               elevador.andarDesejado= Integer.parseInt(leitor.nextLine());
               elevador.SubirElevador();
               elevador.op=Integer.parseInt(leitor.nextLine());
               
               }
           // sair do elevador 
           if (elevador.op==3){
               System.out.println("Informe o numero de pesosas que iram sair do "
                       + "elevador");
               elevador.pessoasAsair= Integer.parseInt(leitor.nextLine());
               elevador.SairElevador();
               elevador.op=Integer.parseInt(leitor.nextLine());
               }
           //descer elevador
            if(elevador.op==4){
               System.out.println("Informe o andar desejado:");
               elevador.andarDesejado= Integer.parseInt(leitor.nextLine());
               elevador.SubirElevador();
               elevador.DescerElevador();
               elevador.op=Integer.parseInt(leitor.nextLine());
               }
            // finalizar programa     
           if(elevador.op==5){
                elevador.FinalizarElevador();
       }
    }
    }

