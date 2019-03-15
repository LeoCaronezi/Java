/* mostra  o plano de  salario e seus respectivos aumentos de acorto com 
 o grupo a qual pertence.
 */
package plano.de.salario;
import java.util.Scanner;
/**
 *
 * @author rafael caronezi 
 */
public class PlanoDeSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner categoria = new Scanner(System.in);
      int categ, porcentagem; 
      double salario, novosalario; 
      System.out.println("Digite qual categoria  você pertencer A,B,C:");
      System.out.println("Digite 1-a, 2-b-,3-c:");
      categ = categoria.nextInt();
      //continuar depois daqui
      System.out.println("Digite seu salario:");
      salario = categoria.nextDouble();
      
      if (categ == 1){
          porcentagem = 15;
           novosalario = (porcentagem/100)* salario +(salario);  
          System.out.println("Seu salario sofreu um aumento de 10 porcento");
          System.out.println(novosalario);
      }
      if (categ == 2){
           novosalario = ((15/100) * salario ) + salario;
           System.out.println("Seu aumento foi de 15 porcento " + novosalario);
         
      }
      if (categ == 3) {
             novosalario = ((20/100) * salario ) + salario;
             System.out.println ("Seu aumento foi de 20 porcento: "+ novosalario);
          
                  
      }
      
      // analisar depois aonde esta desse bloco de codigo.
      /*switch (categ){
          case 1:{
           novosalario = (salario * (10/100)) + salario; 
          System.out.println("Seu salario sofreu um aumento de 10 porcento");
          System.out.println(novosalario);
          break;
          }
          case 2:{ 
           novosalario = ((15/100) * salario ) + salario;
           System.out.println("Seu aumento foi de 15 porcento " + novosalario);
           break;
      }
          case 3 : {
             novosalario = ((20/100) * salario ) + salario;
            System.out.println ("Seu aumento foi de 20 porcento: "+ novosalario);
            break;
          }
    }
    */
}
}