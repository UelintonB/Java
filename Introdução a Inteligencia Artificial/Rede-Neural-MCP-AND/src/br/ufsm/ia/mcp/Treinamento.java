/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.ia.mcp;

/**
 *
 * @author Patrick Guerra
 */
public class Treinamento {
    private double[][] tabelaTreinamento;
    private double[] w; //pesos
    private double c;
    private double limiar;

    public Treinamento(double[][] tabelaTreinamento, double[] w, double limiar, double c) {
        this.tabelaTreinamento = tabelaTreinamento;
        this.w = w;
        this.limiar = limiar;
        this.c = c;
    }
    
    public void executaTreinamento(){
        for (int i = 0; i < 4; i++) {
            encontrarSaida(tabelaTreinamento[i][0], tabelaTreinamento[i][1], tabelaTreinamento[i][2]);
        }
    }
    
    public void encontrarSaida(double x1, double x2, double sd){
        double soma = soma(x1, x2);
        //saida obtida
        double so = transferencia(soma);
        if(so != sd){
            //saida obtida diferente de saida esperada, ajusta o peso e reexecuta o treinamento
            ajustaPeso(sd, so, x1, x2);
            executaTreinamento();
        }
    }
    
    public double soma(double x1, double x2){
        double soma;
        soma = (x1 * w[0]) + (x2 * w[1]);
        //return ((x1 * w[0]) + (x2 * w[1]));
        return soma;
    }
    
    public double transferencia(double soma){
        if(soma <= limiar){
            return 0;
        }
        return 1;
        //return (soma <= limiar) ? 0 : 1;
    }
    
    public void ajustaPeso(double sd, double so, double x1, double x2){
        //calcula erro
        double e = sd - so;
        //calcula o fator de correcaco
        double f1 = c*e*x1;
        double f2 = c*e*x2;
        //calcula o novo peso
        w[0] += f1;
        w[1] += f2;
    }
}
