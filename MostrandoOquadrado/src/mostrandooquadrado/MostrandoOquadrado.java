/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrandooquadrado;
import java.util.Scanner;
/**
 *
 * @author rafae
 */
public class MostrandoOquadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um numero:");
        double numero= scan.nextInt();
        System.out.println("O dobro do numero e:" +(numero *numero) );
        
    }
    
}
