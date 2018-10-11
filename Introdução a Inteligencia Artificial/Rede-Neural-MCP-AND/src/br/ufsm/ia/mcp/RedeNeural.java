/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.ia.mcp;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Guerra
 */
public class RedeNeural {
    private Treinamento treinamento;

    public RedeNeural(Treinamento treinamento) {
        this.treinamento = treinamento;
    }
    
    public void exibeSaida(double x1, double x2, double sd){
        double soma = treinamento.soma(x1, x2);
        double so = treinamento.transferencia(soma);
        if(so == sd){
            JOptionPane.showMessageDialog(null, "Sucesso, saida correta encontrada!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro, saida incorreta encontrada. Reexecute o treinamento!");
        }
    }
}
