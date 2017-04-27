/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula13_exe3_PatrickACGuerra;

/**
 *
 * @author Patrick Guerra
 */
public class Candidato {
    private String nome;
    private String cidade;
    private String estado;
    private float notaProva;
    private int idade;

    public Candidato(String nome, String cidade, String estado, float notaProva, int idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.notaProva = notaProva;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public float getNotaProva() {
        return notaProva;
    }

    public int getIdade() {
        return idade;
    }
}
