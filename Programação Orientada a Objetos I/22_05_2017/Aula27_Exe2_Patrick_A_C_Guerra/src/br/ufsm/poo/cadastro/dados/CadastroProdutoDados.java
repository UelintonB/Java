/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.poo.cadastro.dados;

import java.util.ArrayList;

/**
 *
 * @author Patrick Guerra
 */
public class CadastroProdutoDados {
    private ArrayList<ProdutoModelo> dados;
    
    public CadastroProdutoDados(){
        dados = new ArrayList<ProdutoModelo>();
    }

    public void gravaProduto(String nomeProduto, String especificacaoTecnica, double precoVenda, double precoCusto, int habilitarVenda){
       dados.add(new ProdutoModelo(nomeProduto, especificacaoTecnica, precoVenda, precoCusto, habilitarVenda)); 
    }
}
