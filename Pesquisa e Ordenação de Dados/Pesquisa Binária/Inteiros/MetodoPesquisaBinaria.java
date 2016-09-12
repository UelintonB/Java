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
public class MetodoPesquisaBinaria {
    DadosPesquisaBinaria vetorDados;
    
    public MetodoPesquisaBinaria(DadosPesquisaBinaria vetorDados){
        this.vetorDados = vetorDados; 
    }
    
    public int buscaBinariaRenda (int chave){
        int [] vetor;
        vetor = vetorDados.getVetorDados();
        int inicioVet = 0;
        int finalVet = vetorDados.getNumElementosInseridos() -1;
        int meioVet;
        
        while (true){
            meioVet = (inicioVet + finalVet)/2;
            if (vetor[meioVet]== chave){
                return meioVet; // retorna o indice da chave no vetor
            }else{
                if (inicioVet > finalVet){
                    return -1; // chave nao encontrada no vetor 
                }else {// divide o range
                    if (vetor[meioVet]< chave ){
                        inicioVet = meioVet +1; // busca a esquerda do incice meioVet
                    }else {
                        finalVet = meioVet -1; // buscar a esquerda do indice meioVet
                    }      
                } 
            }
        }
    }
}
