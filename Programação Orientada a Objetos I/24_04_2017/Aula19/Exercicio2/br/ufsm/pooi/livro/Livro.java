/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.pooi.livro;

/**
 *
 * @author Patrick Guerra
 */
public class Livro {
    private String titulo;
    private String autor;

    public void setCadastroLivro(String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
