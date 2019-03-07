/*mostrando idade do usuario atraves do getYear;
*/
/*@autor:RC Rafael caronezi */ 
package mostrandoidade;

import java.util.Scanner;
import java.time.LocalDateTime;
public class MostrandoIdade {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        LocalDateTime data_hora = LocalDateTime.now();
        int ano,idade; 
        String nome;
        System.out.println("Digite seu nome:");
        nome = ler.nextLine();
        System.out.println("Digite seu ano de nascimento");
        ano = ler.nextInt();
        idade = (data_hora.getYear() - ano); 
        System.out.println("Seu nome e "+ nome +",e sua idade e :"+ idade);
    
    }
    
}
