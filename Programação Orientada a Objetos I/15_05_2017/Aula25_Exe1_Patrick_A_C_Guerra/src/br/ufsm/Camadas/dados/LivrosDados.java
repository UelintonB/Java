/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.Camadas.dados;

/**
 *
 * @author Patrick Guerra
 */
public class LivrosDados {
    private String[] titulo = new String[10];
    private String[] autor = new String[10];
    private int numElementoInseridos;

    public void LivrosDados() {
        this.numElementoInseridos = 0;
    }

    public void setLivroDados(String titulo, String autor){
        this.autor[numElementoInseridos] = autor;
        this.titulo[numElementoInseridos] = titulo;
        this.numElementoInseridos++;
    }

    public int getNumElementoInseridos() {
        return numElementoInseridos;
    }
    
    public String getTitulo(int indiceInsere) {
        return titulo[indiceInsere];
    }

    public String getAutor(int indiceInsere) {
        return autor[indiceInsere];
    }

}
