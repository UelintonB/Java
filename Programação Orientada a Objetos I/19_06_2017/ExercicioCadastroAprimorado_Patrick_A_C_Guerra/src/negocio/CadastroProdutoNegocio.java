/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import dados.CadastroProdutoDados;
import java.util.ArrayList;

/**
 *
 * @author Patrick Guerra
 */
public class CadastroProdutoNegocio {
    CadastroProdutoDados cadastroProdutoDados = new CadastroProdutoDados();
    
    public void solicitarGravacaoProdutos(String nomeProduto, String especificacaoTecnica, String precoCusto, int habilitarVenda){
        cadastroProdutoDados.gravaProduto(nomeProduto, especificacaoTecnica, precoCusto, habilitarVenda);
    }
    
    public ArrayList getDadosGravados(){
        return cadastroProdutoDados.getDados();
    }
}
