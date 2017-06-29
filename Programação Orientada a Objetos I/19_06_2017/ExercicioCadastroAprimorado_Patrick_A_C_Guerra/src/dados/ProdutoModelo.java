/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dados;

/**
 *
 * @author Patrick Guerra
 */
public class ProdutoModelo {
    String nomeProduto;
    String especificacaoTecnica;
    double precoVenda;
    double precoCusto;
    int habilitarVenda;

    public ProdutoModelo(String nomeProduto, String especificacaoTecnica, double precoVenda, double precoCusto, int habilitarVenda) {
        this.nomeProduto = nomeProduto;
        this.especificacaoTecnica = especificacaoTecnica;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.habilitarVenda = habilitarVenda;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getEspecificacaoTecnica() {
        return especificacaoTecnica;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public int getHabilitarVenda() {
        return habilitarVenda;
    }
    
}
