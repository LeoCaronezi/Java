/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
import model.CriteriodeAvaliacao;
/**
 *
 * @author rafae
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       CriteriodeAvaliacao av = new CriteriodeAvaliacao();
       System.out.println("Digite seu nome:");
       av.nome = scan.nextLine();
       System.out.println("Digite sua idade:");
       av.idade = Integer.parseInt(scan.nextLine());
       System.out.println("Digite sua nota");
       av.nota1 = Double.parseDouble(scan.nextLine());
       System.out.println("Digite sua segunda nota");
       av.nota2 =Double.parseDouble(scan.nextLine());
       av.mediaFinal(av.nota1, av.nota2);
    }
    
}
