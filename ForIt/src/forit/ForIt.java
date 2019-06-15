/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forit;

/**
 *
 * @author rafae
 */
public class ForIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] vetor ={1,2,3,4,5};
       
       for (int aux : vetor){
           System.out.println(aux);
       }
       int a =6, b =8;
       a--;
       b++;
       System.out.print(--a);
       System.out.print(b++);
       
        }
    
}
