/* usando o Switch case 
  exercecio onde atraves do numero apresento os meses do ano. 
 */
package apresentandoomes;
import java.util.Scanner;
/**
 *
 * @author rafael caronezi
 */
public class ApresentandoOMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner mes = new Scanner (System.in);
       int mesdoano;
       System.out.println("Digite um numero de 1 a  12:");
       mesdoano = mes.nextInt();
       if (mesdoano >0 && mesdoano< 13){
       switch (mesdoano){
       /*    case 1:
               System.out.println("janeiro");
            break;
           case 2 :
               System.out.println("fevereiro");
            break;
           case 3 :
              System.out.println("março");
             break ;
           case 4 :
             System.out.println("abril");
            break;
           case 5 :
               System.out.println("maio");
              break; 
           case 6 : 
               System.out.println("junho");
               break;
           case 7 : 
               System.out.println("julho");
               break;
           case 8: 
               System.out.println("agosto");
              break; 
           case 9 :
              System.out.println("setembro");
              break;
           case 10 :
               System.out.println("outubro");
               break;
           case 11: 
               System.out.println("novembro");
               break;
           case 12: 
               System.out.println("dezembro");
               break;  */
       }
       }
       else {
           System.out.println("o numero digitado e invalido");
       }
    }
}
        
              
       