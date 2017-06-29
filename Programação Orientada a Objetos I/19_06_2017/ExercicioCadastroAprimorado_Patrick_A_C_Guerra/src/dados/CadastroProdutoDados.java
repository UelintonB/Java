/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dados;

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

    public void gravaProduto(String nomeProduto, String especificacaoTecnica, String precoCusto, int habilitarVenda){
       Double precoVenda = Double.parseDouble(precoCusto)*1.2;
       dados.add(new ProdutoModelo(nomeProduto, especificacaoTecnica, precoVenda, Double.parseDouble(precoCusto), habilitarVenda)); 
    }
    
    public ArrayList getDados(){
        return dados;
    }
    
}
