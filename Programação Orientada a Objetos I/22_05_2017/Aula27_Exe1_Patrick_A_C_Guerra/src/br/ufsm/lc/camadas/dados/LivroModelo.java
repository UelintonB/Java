/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.lc.camadas.dados;

/**
 *
 * @author Patrick Guerra
 */
public class LivroModelo {
    String titulo;
    String autor;

    public LivroModelo(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
}
