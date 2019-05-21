/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rafae
 */
public class CriteriodeAvaliacao {
    public String nome;
    public int idade ;
    public double nota1, nota2 ;
    
    
   public double  mediaFinal(double nota1, double nota2){
       double media = (nota1+nota2)/2;
       if(media<6){
           System.out.println("voce não alcançou a media pra aprovação");
           System.out.print(media);
       }
       else {
           System.out.println("você esta aprovado");
       }
       return media;
   }
   
}
