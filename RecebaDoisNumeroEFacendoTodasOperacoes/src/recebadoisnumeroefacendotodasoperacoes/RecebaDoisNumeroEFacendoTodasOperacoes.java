/*receba dois numero  e  mostre todas as operaçoes matematicas.
 */
package recebadoisnumeroefacendotodasoperacoes;
import java.util.Scanner;
/**
 *
 * @author rafael caronezi
 */
public class RecebaDoisNumeroEFacendoTodasOperacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leitor = new Scanner (System.in);
      float num, num1;
      System.out.println("Digite um numero:");
      num = leitor.nextFloat();
      System.out.println("Digite o segundo numero");
      num1 = leitor.nextFloat();
      System.out.println(num+num1);
      System.out.println(num-num1);
      System.out.println(num*num1);
      System.out.println(num/num1);
      
    }
    
}
