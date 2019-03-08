/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aumentodesalario;
import java.util.Scanner;
/**
 *
 * @author rafae
 */
public class AumentoDeSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leitor = new Scanner (System.in);
      double salario, porcentagem,salariocorrigido;
      System.out.println("Digite o seu salario atual: ");
      salario= leitor.nextDouble();
      System.out.println("digite o percentual do aumento:");
      porcentagem= leitor.nextDouble();
      salariocorrigido = ((porcentagem/100)*salario) + salario;
      System.out.println("O seu salario e "+ salario+"O aumento foi para, "
                           +salariocorrigido );
    }
    
}
