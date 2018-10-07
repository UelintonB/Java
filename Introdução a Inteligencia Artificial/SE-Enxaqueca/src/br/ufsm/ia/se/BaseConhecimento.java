/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.ia.se;

/**
 *
 * @author Patrick Guerra
 */
public class BaseConhecimento {
    private int duracaoCefaleia;
    private int intensidadeDorDeCabeca;
    private int latejamento;
    private int possuiNauseaVomito;
    private int dorDeCabecaUnilateral;
    private int dorDeCabecaAumentaBarulho;
    private int dorDeCabecaAumentaLuz;
    private int dorDeCabecaAumentaMovimentacao;

    public BaseConhecimento(int duracaoCefaleia, int intensidadeDorDeCabeca, int latejamento, int possuiNauseaVomito, int dorDeCabecaUnilateral, int dorDeCabecaAumentaBarulho, int dorDeCabecaAumentaLuz, int dorDeCabecaAumentaMovimentacao) {
        this.duracaoCefaleia = duracaoCefaleia;
        this.intensidadeDorDeCabeca = intensidadeDorDeCabeca;
        this.latejamento = latejamento;
        this.possuiNauseaVomito = possuiNauseaVomito;
        this.dorDeCabecaUnilateral = dorDeCabecaUnilateral;
        this.dorDeCabecaAumentaBarulho = dorDeCabecaAumentaBarulho;
        this.dorDeCabecaAumentaLuz = dorDeCabecaAumentaLuz;
        this.dorDeCabecaAumentaMovimentacao = dorDeCabecaAumentaMovimentacao;
    }
    
    //Define a primeira etapa da base de regra para os sontomas da ENXAQUECA
    public double sintomasParcialEnxaqueca1(){
        double possibilidadeEnxaqueca = 0;
        if(this.duracaoCefaleia == 1){
            if(this.dorDeCabecaUnilateral == 1){
                possibilidadeEnxaqueca += 0.25;
            }
            if(this.intensidadeDorDeCabeca == 1 || this.intensidadeDorDeCabeca == 2){
                possibilidadeEnxaqueca += 0.25;
            }
            if(this.latejamento == 1){
                possibilidadeEnxaqueca += 0.25;
            }
            if(this.dorDeCabecaAumentaMovimentacao == 1){
                possibilidadeEnxaqueca += 0.25;
            }
        }
        return possibilidadeEnxaqueca;
    }
    
    //Define a segunda etapa da base de regra para os sontomas da ENXAQUECA
    public double sintomasParcialEnxaqueca2(){
        double possibilidadeEnxaqueca = 0;
        if(this.possuiNauseaVomito == 1){
            possibilidadeEnxaqueca += 0.5;
        }
        if(this.dorDeCabecaAumentaBarulho == 1 || this.dorDeCabecaAumentaLuz == 1){
            possibilidadeEnxaqueca += 0.5;
        }
        return possibilidadeEnxaqueca;
    }
}
