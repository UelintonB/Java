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
public class VetorPesquisaBinaria {
    DadosPesquisaBinaria[] vetorDados;
    int numElementosInseridos;
    
    public VetorPesquisaBinaria (int numMax){
        vetorDados = new DadosPesquisaBinaria [numMax];
        numElementosInseridos = 0;
    }
    
    public void inserirDados (String nome, int idade, double renda){
        vetorDados[numElementosInseridos] = new DadosPesquisaBinaria(nome,idade,renda);
        numElementosInseridos ++;
    }
    
    public void imprimirDados (){
        for (int i=0; i<numElementosInseridos; i++){
            System.out.println("Nome: "+vetorDados[i].getNome()+", Idade: "+vetorDados[i].getIdade()+", Renda: "+vetorDados[i].getRenda());
        }
    }
        
    public void setVetorDados(DadosPesquisaBinaria[] vetorDados){
        this.vetorDados = vetorDados;
    }
    public DadosPesquisaBinaria[] getVetorDados(){   
        return vetorDados;
    }
    
    public int getNumElementosInseridos(){
        return numElementosInseridos;
    } 
    
    public DadosPesquisaBinaria getValorByID (int id){
        return vetorDados[id];// obtem/retorna registro/elemento que está na posição: id
    }
        
    public void setValorByID (int id, DadosPesquisaBinaria objDados){
        this.vetorDados[id] = objDados;// atribui o registro/elemento objDados ao indice/posição: id
    }     
  
    public void decrementaNumElementosInseridos(){
        numElementosInseridos--;
    }
   
    public void incrementaNumeElementosInseridos (){
        numElementosInseridos++;
    }
    
    public void setValorPosicaoLivre(int id){
        this.vetorDados[id].setIdade(-1);
    }
}
