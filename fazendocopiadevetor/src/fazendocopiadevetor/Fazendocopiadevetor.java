/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazendocopiadevetor;
 import java.util.*;

/**
 *
 * @author rafae
 */
public class Fazendocopiadevetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner( System.in);
        int vetNum[]= new int [10];
        for (int V =0; V<9; V++){
            System.out.println("Escreva um número:");
            vetNum[V]= teclado.nextInt();
         }
      //  Arrays.sort(vetNum);
      System.out.println("Digite a posição que será copiada");
       int copia = teclado.nextInt();
       int novoVetor[]  = Arrays.copyOf(vetNum , copia);
       for ( int V =0; V< copia; V++){
        System.out.println(novoVetor[V]);
    }
              
    }
    
}
