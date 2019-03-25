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
      Scanner  scan = new Scanner (System.in);
      double salario, novosalario;
      int cont;
      System.out.println("escolha qual categoria voce pertence");
      System.out.println("1- grupo a:");
      System.out.println("2-grupo b:");
      System.out.println("3-grupo c:");
      cont = 1;
      System.out.println("Digite seu salario:");
      salario = 1000;
      switch (cont){
          case 1 :{
              novosalario = (((10/100) * salario ) + salario);
              System.out.println(novosalario);
              break;
          }
          case 2 :
          {
              novosalario=  ((15/100) * salario) + salario;
              System.out.println(novosalario);
              break;
          }
          case 3 : 
             novosalario = ((20/100) * salario) + salario;
             System.out.println(novosalario);
             break;
      }
}
}