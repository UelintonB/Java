/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.ia.preceptron.and;

/**
 *
 * @author Patrick Guerra
 */
public class TestePerceptron {
    private int [][]x; // = [1 1] ou [1 0] ou [0 1] ou [0 0]
    private int []T; // T=[1] ou [-1] 
    private double[] W;
    
    private double b;
    
    private double limiar = 0.2;
    private int resultado = 0;
    private int numAmostrasEntrada;
    private int numNeuroniosEntrada;

    public TestePerceptron(int[][] x, int[] T, double[] W, double b) {
        this.x = x;
        this.T = T;
        this.W = W;
        this.b = b;
        
        this.numNeuroniosEntrada = x[0].length; // colunas = 2
        this.numAmostrasEntrada = x.length; // linhas = 1
    }
    
    public void executaTeste(){
        double SomatorioYin = 0, Yin = 0;
        int y = 0;
        System.out.print("\n\n=========TESTE DA RNA=========");
        
        // - Passo 2: Para cada amostra de treinamento (x1..xn) (t1..tn) faca
        for(int amostra = 0; amostra < (numAmostrasEntrada - 1); amostra++){
            // - Passo 3: Calcule o potencial de ativacao (saida y_in) para cada 
            SomatorioYin = 0;
            for (int i = 0; i < numNeuroniosEntrada; i++) {
                System.out.print("\tX:"+i);
                SomatorioYin += x[amostra][i] * W[i];
            }
            Yin = SomatorioYin + b; // funcao de ativacao
            System.out.print("\tYin = "+Yin);
            
            // - Passo 4: Calcule a resposta do neuronio de saida(y), aplicando
            if (Yin > limiar) {
                y = 1;
            }else if(Yin < -limiar){
                y = -1;
            }else{
                y = 0;
            }
            System.out.print("\tY = "+y);
            System.out.print("\tT = "+T[amostra]);
            
            // - Passo 5: Verificar o Acerto / Erro: O resultado que a rede 
            // encontrou foi igual ao desejado (t_amostra)
            if(y == T[amostra]){
                System.out.print("\nA RNA Acertou!");
                resultado = 1;
            }else{
                System.out.print("\nA RNA Errou!");
                resultado = 0;
            }
        }
    }

    public int getResultado() {
        return resultado;
    }
    
}
