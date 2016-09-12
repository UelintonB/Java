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
public class DadosPesquisaBinaria {
    private int vetorDados[];
    int numElementosInseridos;
    
    public DadosPesquisaBinaria (int numMax){
        vetorDados = new int[numMax];
        numElementosInseridos = 0;
    }
    
    public void inserirDados (int dado){
        vetorDados[numElementosInseridos] = dado;
        numElementosInseridos ++;
    }
    
    public void imprimirDados (){
        for (int i=0; i<numElementosInseridos; i++){
            System.out.print(vetorDados[i]+" ");
        }
    }
        
    public int[] getVetorDados(){   
        return vetorDados;
    }
    
    public int getNumElementosInseridos(){
        return numElementosInseridos;
    }   
  
    public void decrementaNumElementosInseridos(){
        numElementosInseridos--;
    }
   
    public void incrementaNumeElementosInseridos (){
        numElementosInseridos++;
    }
}
