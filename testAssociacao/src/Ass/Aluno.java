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
public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

   

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void print(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        
        if (this.seminario != null){
            System.out.println(this.seminario.getTitulo());
        }
        
    }
           
}
