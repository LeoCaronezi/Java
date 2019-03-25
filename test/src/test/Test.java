/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
/**
 *
 * @author rafae
 */
public class Test {

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
      cont = scan.nextInt();
      System.out.println("Digite seu salario:");
      salario = scan.nextDouble();
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
      }    }
    
}
