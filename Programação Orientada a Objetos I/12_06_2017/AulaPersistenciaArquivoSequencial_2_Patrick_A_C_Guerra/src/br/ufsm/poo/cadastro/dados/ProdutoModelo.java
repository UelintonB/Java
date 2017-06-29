/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.poo.cadastro.dados;

/**
 *
 * @author Patrick Guerra
 */
public class ProdutoModelo {
    private String nomeProduto;
    private String especificacaoTecnica;
    private double precoVenda;
    private double precoCusto;
    private int habilitarVenda;

    public ProdutoModelo(){
        
    }
    
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

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setEspecificacaoTecnica(String especificacaoTecnica) {
        this.especificacaoTecnica = especificacaoTecnica;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setHabilitarVenda(int habilitarVenda) {
        this.habilitarVenda = habilitarVenda;
    }
    
    
}
