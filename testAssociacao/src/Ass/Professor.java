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
public class Professor {
    private String nome;
    private String especialicao;
    private Seminario[] seminario;

    public Professor() {
    }

    public Professor(String nome, String especialicao) {
        this.nome = nome;
        this.especialicao = especialicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getEspecialicao() {
        return especialicao;
    }

    public void setEspecialicao(String especialicao) {
        this.especialicao = especialicao;
    }
}
