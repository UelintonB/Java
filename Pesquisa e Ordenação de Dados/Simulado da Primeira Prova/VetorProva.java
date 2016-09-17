/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrickAndreiCaronGuerra;

/**
 *
 * @author Patrick Guerra
 */
public class VetorProva {
    DadosProva[] vetorDados;
    int numElementosInseridos;
    
    public VetorProva (int numMax){
        vetorDados = new DadosProva [numMax];
        numElementosInseridos = 0;
    }
    
    public void inserirDados (String nome, int idade, double renda){
        vetorDados[numElementosInseridos] = new DadosProva(nome,idade,renda);
        numElementosInseridos ++;
    }
    
    public void imprimirDados (){
        for (int i=0; i<numElementosInseridos; i++){
            System.out.println("Nome: "+vetorDados[i].getNome()+", Distância: "+vetorDados[i].getDistancia()+", Valor: "+vetorDados[i].getValor());
        }
    }
        
    public void setVetorDados(DadosProva[] vetorDados){
        this.vetorDados = vetorDados;
    }
    
    public DadosProva[] getVetorDados(){   
        return vetorDados;
    }
    
    public int getNumElementosInseridos(){
        return numElementosInseridos;
    } 
    
    public DadosProva getValorByID (int id){
        return vetorDados[id]; // retorna ponteiro(NãO), digo referência do elemento que está na posição id
    }
        
    public void setValorByID (int id, DadosProva objDados){
        this.vetorDados[id] = objDados; //Atribui o ponteiro(NãO), digo referência recebida: objDados na posição: id
    }     
  
    public void decrementaNumElementosInseridos(){
        numElementosInseridos--;
    }
   
    public void incrementaNumeElementosInseridos (){
        numElementosInseridos++;
    }
}
