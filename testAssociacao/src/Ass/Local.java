/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ass;

/**
 *
 * @author rafae
 */
public class Local {
    private String bairro;

    public Local() {
    }

    public Local(String bairro, String rua) {
        this.bairro = bairro;
        this.rua = rua;
    }
    private String rua;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
