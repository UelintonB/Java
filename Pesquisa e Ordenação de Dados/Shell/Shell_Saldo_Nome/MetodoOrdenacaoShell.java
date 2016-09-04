/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shell;

/**
 *
 * @author Patrick Guerra
 */
public class MetodoOrdenacaoShell {
    
    VetorDadosShell vetorDados;

    public MetodoOrdenacaoShell(VetorDadosShell vetorDados) {
        this.vetorDados = vetorDados;
    }
    
    public void ordenacaoShellPorNome(){
        int numMaxElementos = vetorDados.getNumElementosInseridos();
        DadosShell[] vetor = vetorDados.getVetorDados();
        
        int i,j;
        DadosShell temp;
        
        int h = 1;
        while(h <= numMaxElementos/3){
            h= h*3 + 1;
        }
        while(h>0){
            for(j=h; j<numMaxElementos; j++){
                temp = vetor[j];
                i = j;
                //0 se igual
                //maior que 0 se o  argumento é uma string lexicographically maior do que a cadeia,
                //retorna menor que 0 se o  argumento é uma string lexicographically menor do que a cadeia.
                while(i > h-1 && vetor[i-h].getNome().compareTo(temp.getNome()) > 0){
                    vetor[i] = vetor[i-h];
                    i -= h;
                }
                vetor[i] = temp;
            }
            h = (h-1) / 3;
        }
            
    }
    
    public void ordenacaoShellSaldo(){
        int numMaxElementos = vetorDados.getNumElementosInseridos();
        DadosShell[] vetor = vetorDados.getVetorDados();
        
        int i,j;
        DadosShell temp;
        
        int h = 1;
        while(h <= numMaxElementos/3){
            h= h*3 + 1;
        }
        while(h>0){
            for(j=h; j<numMaxElementos; j++){
                temp = vetor[j];
                i = j;
                
                while(i > h-1 && vetor[i-h].getSaldo() >= temp.getSaldo()){
                    vetor[i] = vetor[i-h];
                    i -= h;
                }
                vetor[i] = temp;
            }
            h = (h-1) / 3;
        }
    }
}
