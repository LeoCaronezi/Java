/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author rafael caronezi
 */
public class Function {
    
    
    public void limpar (){
        
    }
    public void  gerar (){
     Random cria = new Random ();
     
     for (int i = 0; i<15; i++){
       System.out.println(cria.nextInt(26));
     }
    }
}
