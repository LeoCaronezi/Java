/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversodedolarprareal;
import java.util.Scanner;
/**
 *
 * @author rafael caronezi 
 */
public class Conversodedolarprareal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lastro = new Scanner (System.in);
        double real , dolar;
        System.out.println ("Digite a cotação do dolar:");
        dolar = lastro.nextDouble();
        System.out.println("Digite o valor em reais que sera consumido: ");
        real = lastro.nextDouble();
        System.out.println("voce possuir,R$ "+ real + " , em Dolar ,e "
               + (real / dolar)  );
        
    }
    
}
