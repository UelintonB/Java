/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.poo.cadastro.negocio;
import br.ufsm.poo.cadastro.dados.CadastroProdutoDados;


/**
 *
 * @author Patrick Guerra
 */
public class CadastroProdutoNegocio {
    CadastroProdutoDados cadastroProdutoDados = new CadastroProdutoDados();
    
    public void solicitarGravacaoProdutos(String nomeProduto, String especificacaoTecnica, double precoVenda, double precoCusto, int habilitarVenda){
        cadastroProdutoDados.gravaProduto(nomeProduto, especificacaoTecnica, precoVenda, precoCusto, habilitarVenda);
    }

}
