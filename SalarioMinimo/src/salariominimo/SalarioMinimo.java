/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariominimo;
import java.util.Scanner;
/**
 *
 * @author rafael caronezi
 */
public class SalarioMinimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      double salario, porcentagem;
        System.out.println("Digite seu salario:");
         salario = scan.nextDouble();
         System.out.println("Digite a porcentagem do seu aumento:");
         porcentagem = scan.nextDouble();
         double sal = salario + (porcentagem/100) * salario ;
          System.out.println((sal <= 958)?"seu salario minimo.":"Seu salario  superio ao minimo.");
        }
    
}
