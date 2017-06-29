/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.lc.camadas.dados;

import java.util.ArrayList;

/**
 *
 * @author Patrick Guerra
 */
public class CadastroLivroDados {
    private ArrayList<LivroModelo> dados;

    public CadastroLivroDados() {
        this.dados = new ArrayList<LivroModelo>();
    }
    
    public void setCadastroLivro(String titulo, String autor){
        LivroModelo livroModelo = new LivroModelo(titulo, autor);
        this.dados.add(livroModelo);
    }

    public ArrayList<LivroModelo> getDados() {
        return dados;
    }
    
}
