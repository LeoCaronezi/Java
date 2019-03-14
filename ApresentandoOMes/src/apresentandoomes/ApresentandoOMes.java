/* usando o Switch case 
  exercecio onde atraves do numero apresento os meses do ano.
   segunda parte informa se o mes escolhido e par ou um mes impar:
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
          if (mesdoano%2 ==0){     
       switch (mesdoano){
          case 1:
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
               break;  
       }
        System.out.println("E um mes par:");
          }
         else {
        System.out.println("o mes e impar:");
       }
       }
      else {
           System.out.println("o numero digitado e invalido");
       } 
    }
}
        
              
       