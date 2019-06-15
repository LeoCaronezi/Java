/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversãodedolarparareal;
import java.util.Scanner;
/**
 *
 * @author rafael caronezi
 */
public class ConversãoDeDolarParaReal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner  (System.in);
      double cotacao,dolar;
      System.out.println("Digite a cotação do dolar: ");
      cotacao = scan.nextDouble();
      System.out.println("Digite o valor em dolar:");
      dolar = scan.nextDouble();
      System.out.println("A cotação do dolar e,R$ "+cotacao + "a quantidade de"
              + " a quantidade de dolar e,$ "+ dolar +"isso em reais da, R$" +
              (dolar*cotacao) );
    }
    
}
