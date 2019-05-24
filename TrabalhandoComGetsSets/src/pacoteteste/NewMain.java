/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteteste;
import java.util.Scanner;
import model.Funcionario;
/**
 *
 * @author rafae
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario fun = new Funcionario();
        Scanner scan = new Scanner (System.in);
        
       fun.init("Rafael",149,10);
       fun.imprimir();
       
    }
    
}
