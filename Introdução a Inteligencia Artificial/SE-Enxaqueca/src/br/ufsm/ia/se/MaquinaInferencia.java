/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.ia.se;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Guerra
 */
public class MaquinaInferencia {
    private int duracaoCefaleia;
    private int intensidadeDorDeCabeca;
    private int latejamento;
    private int possuiNauseaVomito;
    private int dorDeCabecaUnilateral;
    private int dorDeCabecaAumentaBarulho;
    private int dorDeCabecaAumentaLuz;
    private int dorDeCabecaAumentaMovimentacao;
    private BaseConhecimento baseConhecimento;

    public MaquinaInferencia(int duracaoCefaleia, int intensidadeDorDeCabeca, int latejamento, int possuiNauseaVomito, int dorDeCabecaUnilateral, int dorDeCabecaAumentaBarulho, int dorDeCabecaAumentaLuz, int dorDeCabecaAumentaMovimentacao) {
        this.duracaoCefaleia = duracaoCefaleia;
        this.intensidadeDorDeCabeca = intensidadeDorDeCabeca;
        this.latejamento = latejamento;
        this.possuiNauseaVomito = possuiNauseaVomito;
        this.dorDeCabecaUnilateral = dorDeCabecaUnilateral;
        this.dorDeCabecaAumentaBarulho = dorDeCabecaAumentaBarulho;
        this.dorDeCabecaAumentaLuz = dorDeCabecaAumentaLuz;
        this.dorDeCabecaAumentaMovimentacao = dorDeCabecaAumentaMovimentacao;
    }
    
    //Compara o estado do paciente com o conhecimento inserido na base de conhhecimento
    public void consultaBaseConhecimento(){
        this.baseConhecimento = new BaseConhecimento(
            duracaoCefaleia, 
            intensidadeDorDeCabeca, 
            latejamento, 
            possuiNauseaVomito, 
            dorDeCabecaUnilateral, 
            dorDeCabecaAumentaBarulho, 
            dorDeCabecaAumentaLuz,
            dorDeCabecaAumentaMovimentacao
        );
        double possibilidadeEnxaqueca1 = this.baseConhecimento.sintomasParcialEnxaqueca1();
        double possibilidadeEnxaqueca2 = this.baseConhecimento.sintomasParcialEnxaqueca2();
        tomadaDeDecisao(possibilidadeEnxaqueca1, possibilidadeEnxaqueca2);
    }
    
    //Toma a decisção se o paciente tem ou não enxaqueca
    public void tomadaDeDecisao(double possibilidadeEnxaqueca1, double possibilidadeEnxaqueca2){
        if(possibilidadeEnxaqueca1 >= 0.5 && possibilidadeEnxaqueca2 >= 0.5){
            JOptionPane.showMessageDialog(null, "O paciente possui enxaqueca!!\n"+
                    "procure um neurologista.");
        }else{
            String mensagem = "O paciente NÃO possui enxaqueca!!\n";
            
            if(this.duracaoCefaleia == 2){
                mensagem += "mas possui dor de cabeça muito prolongada..\n"+
                        "procure um neurologista .";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
