/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.lc.camadas.negocio;

import br.ufsm.lc.camadas.dados.CadastroLivroDados;
import java.util.ArrayList;

/**
 *
 * @author Patrick Guerra
 */
public class CadastroLivroNegocio {
    private CadastroLivroDados cadastroLivroDados;
    
    public CadastroLivroNegocio(){
        this.cadastroLivroDados = new CadastroLivroDados();
    }
    
    public void inserirLivros(String titulo, String autor){
        this.cadastroLivroDados.setCadastroLivro(titulo, autor);
    }
    
    public ArrayList getDadosGravados(){
        return cadastroLivroDados.getDados();
    }
}
