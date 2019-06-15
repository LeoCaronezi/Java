/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Ass.Aluno;
import Ass.Seminario;
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
     Scanner scan = new Scanner (System.in);   
     Aluno estudante = new Aluno ();
     Seminario seminario = new  Seminario ("111");
     System.out.println("Digite seu nome");
     estudante.setNome(scan.nextLine());
     System.out.println("Digite idade");
     estudante.setIdade(Integer.parseInt(scan.nextLine()));
     estudante.setSeminario(seminario);
     estudante.print();
    

    }
    
}
