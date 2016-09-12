/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pesquisabinaria2016inteiros;

/**
 *
 * @author Patrick Guerra
 */
public class MetodoOrdenacaoShellSort {
    DadosPesquisaBinaria vetorDados;
    
    public MetodoOrdenacaoShellSort(DadosPesquisaBinaria vetorDados) {
        this.vetorDados = vetorDados;
    }
    
    public void ordenacaoShell(){
        int NumElementosInseridos = vetorDados.getNumElementosInseridos();
        int[] vetor = vetorDados.getVetorDados();
        
        int i,j;
        int temp;
        
        int h = 1;
        while(h <= NumElementosInseridos/3){
            h= h*3 + 1;
        }
        while(h>0){
            for(j=h; j<NumElementosInseridos; j++){
                temp = vetor[j];
                i = j;
                
                while(i > h-1 && vetor[i-h]>= temp){
                    vetor[i] = vetor[i-h];
                    i -= h;
                }
                vetor[i] = temp;
            }
            h = (h-1) / 3;
        }
    }
}
