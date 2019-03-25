/*
 Receba uma sequência de 5 números inteiros, armazene-os em um vetor e exiba o
somatório dos números digitados..
 */
package aula250319;
import java.util.Scanner;
/**
 *
 * @author rafae
 */
public class Aula250319 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leitor = new Scanner (System.in);
      int vetnum [] = new int[5];
       int soma =0;
        for (int i = 0; i<5; i++){
          System.out.println("Escreva um numero: ");
            vetnum[i]= leitor.nextInt();
          // somatorio = somaorio  + vetor
            soma = soma + vetnum[i];
          
        }
        // lista somatorio
        System.out.println("O somatorio e :"+ soma);
    }
    
}
