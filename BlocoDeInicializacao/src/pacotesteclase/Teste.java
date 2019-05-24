/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotesteclase;
import  pacoteblocodecodico.ClasseBlocoDeCodigo;
/**
 *
 * @author rafae
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ClasseBlocoDeCodigo teste = new ClasseBlocoDeCodigo();
    System.out.println("mostrando o numero de parcelas teste 1:");
    for (int parcela : teste.getParcelas()){
        System.out.println(parcela);
    }
    }
    
}
