/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.ia.preceptron.and;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Guerra
 */
public class TreinamentoPerceptron {
    private int x[][]; //base de dados
    private int []t; //alvo
    
    private double []w; //w matriz de pesos sinapticos
    private double limiar; //limiar para ser utilizado na funcao de ativacao 
    private double alfa; // = 1; taxa de aprendizagem
    private double b; // =0
    
    private int numNeuroniosEntrada; // 2 colunas
    private int numAmostrasTreinamento; // 4 linhas 
    private int neuroniosSaida; // 1

    public TreinamentoPerceptron(int[][] x, int[] t, double[] w) {
        this.x = x;
        this.t = t;
        this.w = w;
        
        this.numNeuroniosEntrada = x[0].length; // colunas = 2
        this.neuroniosSaida = 1;
        // Linhas = 4 amostra de treinamento
        this.numAmostrasTreinamento = x.length; 
        
        // passo 0: inicialize os pesos (W1..Wn) e bias (b)
        // W1...Wn = 0; b = 0; taxaAprendizagem = 1; limiar = 0.2;
        this.b = 0;
        this.alfa = 1; // taxa de aprendizagem
        this.limiar = 0.2;
    }
    
    public void executaTreinamento(){
        /* Treinamento Perceptron
         * 
         * - Passo 0: (Executado no construtor e na GUI) inicialize os pesos 
         * (W1..Wn) e bias (b)
         * - Passo 1: Condicao de parada da rede neural
         */
        
        boolean continuaTreinamento = true;
        double y_in = 0; // potencial de ativacao
        double somatorioYin = 0;
        double y;
        int epocas = 0; // epocas ou passos
        
        while (continuaTreinamento) {            
            continuaTreinamento = false;
            epocas++;
            // - Passo 2: Para cada amostra de treinamento (x1..xn) (t1..tn)
            // faca os passos 3 a 5
            
            for (int amostra = 0; amostra < numAmostrasTreinamento; amostra++) {
                // - Passo 3: Calcule o potencial de ativacao (Saida Yin) para 
                // cada neuronio 
                somatorioYin = 0;
                for (int i = 0; i < numNeuroniosEntrada; i++) {
                    System.out.print("\tx:"+i);
                    somatorioYin += x[amostra][i] * w[i];
                }
                y_in = somatorioYin + b; // funcao de ativacao
                
                // - Passo 4: Calcule a resposta do neuronio de saida(y),
                // aplicando a funcao de ativacao
                if(y_in > limiar){
                    y = 1;
                }else if(y_in < -limiar){
                    y = -1;
                }else{
                    y = 0;
                }
                
                // - Passo 5: Atualiza os pesos caso a Saida Y seja diferente 
                if(y != t[amostra]){
                    continuaTreinamento = true;
                    for (int i = 0; i < numNeuroniosEntrada; i++) {
                        w[i] += alfa * t[amostra] * x[amostra][i];
                    }
                    b += alfa * t[amostra];
                    System.out.print("\tb="+b);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Viva a RNA terminou! Somente com "
        + epocas + " epocas!");
    }

    public double getB() {
        return b;
    }
    
    
}
