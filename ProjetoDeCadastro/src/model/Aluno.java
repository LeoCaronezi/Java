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
public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;
public Aluno(){
    
}    

public Aluno (String nome, int idade,Seminario seminario){
    this.nome = nome;
    this.idade = idade;
    this.seminario = seminario;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void escrever (){
        System.out.println("O nome do aluno:"+ this.nome);
        System.out.println("A idade do aluno" + this.idade);
    }
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    
    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
