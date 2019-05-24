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
public class Funcionario {
    private int matricula;
    private long cpf;
    private String nome;
 public Funcionario(){
     
 }
   /* public String init(String nome, String cpf, String matricula){
        this.nome =nome;
        this.cpf = cpf;
        this.matricula = matricula; 
        
    }*/
    public void init(String nome, long cpf, int matricula){
        this.nome =nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void imprimir (){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.cpf);
    }
}
