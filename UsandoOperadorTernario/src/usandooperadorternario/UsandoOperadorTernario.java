/* 
 .
 */
package usandooperadorternario;
import java.util.Scanner;
/**
 *
 * @author rafael caronezi
 */
public class UsandoOperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       int num,parouimpar ; 
       System.out.println("Digite um numero :");
       num = scan.nextInt();
       System.out.println((num%2 ==0)? "par":"impar");
    }
    
}
