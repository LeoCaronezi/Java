/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carteira.de.motorista;
 import java.util.Scanner;
 import java.time.*;
/**
 *
 * @author rafael caronezi 
 */
public class CarteiraDeMotorista {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      LocalDateTime ano = LocalDateTime.now();
      int nascimento;
      System.out.println("Digite seu ano de nascimento:");
      nascimento= scan.nextInt();
      int licenca = ano.getYear() - nascimento;
      System.out.println((licenca>18) ? "aprovada":"negada");
       
    }
    
}
