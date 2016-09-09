/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PesquisaBinaria;

/**
 *
 * @author Patrick Guerra
 */
public class MetodoPesquisaBinaria {
    VetorPesquisaBinaria vetorDados;
    
    public MetodoPesquisaBinaria(VetorPesquisaBinaria vetorDados){
        this.vetorDados = vetorDados; 
    }
    
    public int buscaBinariaRenda (double chave){
        int inicioVet = 0;
        int finalVet = vetorDados.getNumElementosInseridos() -1;
        int meioVet;
        
        while (true){
            meioVet = (inicioVet + finalVet)/2;
            if (vetorDados.getValorByID(meioVet).getRenda()== chave){
                return meioVet; // retorna o indice da chave no vetor
            }else{
                if (inicioVet > finalVet){
                    return -1; // chave nao encontrada no vetor 
                }else {// divide o range
                    if (vetorDados.getValorByID(meioVet).getRenda()< chave ){
                        inicioVet = meioVet +1; // busca a esquerda do incice meioVet
                    }else {
                        finalVet = meioVet -1; // buscar a esquerda do indice meioVet
                    }      
                } 
            }
        }
    }
    
    public int buscaBinariaNome(String chave){
        int inicioVet = 0;
        int finalVet = vetorDados.getNumElementosInseridos() -1;
        int meioVet;
        
        while (true){
            meioVet = (inicioVet + finalVet)/2;
            if (vetorDados.getValorByID(meioVet).getNome().compareTo(chave) == 0){
                return meioVet; // retorna o indice da chave no vetor
            }else{
                if (inicioVet > finalVet){
                    return -1; // chave nao encontrada no vetor 
                }else {// divide o range
                    if (vetorDados.getValorByID(meioVet).getNome().compareTo(chave) < 0){
                        inicioVet = meioVet +1; // busca a esquerda do incice meioVet
                    }else {
                        finalVet = meioVet -1; // buscar a esquerda do indice meioVet
                    }      
                } 
            }
        }
    }
}
