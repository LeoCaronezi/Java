/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testePrincipal;
import colaborador.Funcionario;
import java.util.Scanner;
/**
 *
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Funcionario fun = new Funcionario ();
       Scanner ler = new Scanner (System.in);
       System.out.println("Digite seu nome:");
       String nome = ler.nextLine();
       fun.setNome(nome);
      // System.out.println("Digite sua idade:");
     ////  int idade = Integer.parseInt(ler.nextLine());
     //  fun.setIdade(idade);
       System.out.println("digite seu endereco");
       String x = ler.nextLine();
          //    System.out.println("digite seu endereco");
     //  String c = ler.nextLine();

       fun.setEndereco(x);

      System.out.println(fun.getEndereco());

    }
    
}
