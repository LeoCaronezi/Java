/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;
import java.util.*;
/**
 *
 * @author rafae
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado  = new Scanner (System.in);
        int vetordocapiroto[] = new int [8];
        for (int v = 0; v<7 ;  v++){
            System.out.println("dvite um numero seu doido:");
            vetordocapiroto[v]= teclado.nextInt();
        }
        Arrays.sort(vetordocapiroto);
              /*  for (int v = 0; v<7 ; v++){
                 // esta merda foi exucutada 8 vezes comando array sort 
                  Arrays.sort(vetordocapiroto);
                 System.out.println(vetordocapiroto[v]);
                 }
 
        }
        */
       System.out.println("   ");
      // exibindo o menor numero        
       System.out.println("Este e o menor numero:"+vetordocapiroto[0]);

      // exibindo o maior numero 
       System.out.println("Este e o maior numero:" +vetordocapiroto[7]);
}
}