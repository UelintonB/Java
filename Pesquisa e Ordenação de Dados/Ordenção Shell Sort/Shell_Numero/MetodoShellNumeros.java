/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellPodNumero;

/**
 *
 * @author Patrick Guerra
 */
public class MetodoShellNumeros {
    private int [] vetor;
    private int numElementosInseridos;
    
    public MetodoShellNumeros(int numMax){
        vetor = new int[numMax];
        numElementosInseridos = 0;
    }
    
    public void inserirDados(int dado){
        vetor[numElementosInseridos] = dado;
        numElementosInseridos++;
    }
    
    public void imprime(){
        for(int j=0;j<numElementosInseridos;j++){
            System.out.print(vetor[j]+" ");
        }
    }
    
    public void ordenacaoShell(){
        int i, j;
        int temp;
        //define o valor do incremento (h) - Sequencia de intervalos Knuth
        int h = 1;
        while(h <= numElementosInseridos/3){
            h = h*3 +1;
        }
        while(h>0){
            for(j=h; j<numElementosInseridos; j++){
                temp = vetor[j];
                i = j;
                
                while(i > h-1 && vetor[i-h] >= temp){
                    vetor[i] = vetor[i-h];
                    i -= h;
                }
                vetor[i] = temp;
            }
            h = (h-1) / 3;
        }
        
    }
}
