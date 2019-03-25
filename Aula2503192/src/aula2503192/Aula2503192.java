/*
Receba uma sequência de 10 números inteiros. Em seguida, exiba os números
armazenados em posições ímpares.
*/
package aula2503192;
import java.util.Scanner;
/**
 *
 * @author rafael caronezi
 */
public class Aula2503192 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitor = new Scanner (System.in);
       int vetor [] = new int [10];
        for ( int contador = 1; contador <10; contador ++){
          System.out.println("Digite um numero:");
          vetor[contador] = leitor.nextInt();
         }
      /*  for ( int contador = 0; contador <9; (contador++2)){
        System.out.println(vetor[contador]);
*/  
      for (int contador= 1; contador <10 ; contador ++){
          if (contador %2 ==1){
              System.out.print("  ");
             System.out.println(vetor[contador]);
          }
    }
    }
    
}
