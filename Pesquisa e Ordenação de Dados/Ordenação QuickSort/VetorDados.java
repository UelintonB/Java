/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ordenacao.quicksort.nome.iddade;

/**
 *
 * @author patri
 */
public class VetorDados {
    private TReg[] vetorDados;
    private int numElementosInderidos;
        public TReg[] getVetorDados(){
            return vetorDados;
        }

        public int getNumElementosInseridos(){
            return numElementosInderidos;
        }
        
        public void setVetorDados(TReg[] vetorDados){
            this.vetorDados = vetorDados;    
        }
        
        public VetorDados(int numMax){
            vetorDados = new TReg[numMax];
            numElementosInderidos = 0;
        }
        
        public void inserirDados(String nomeu,int idadeu){
            vetorDados[numElementosInderidos] = new TReg();
            vetorDados[numElementosInderidos].nome = nomeu;
            vetorDados[numElementosInderidos].idade = idadeu;
            numElementosInderidos++;
        }
        
        public void imprime(){
            for(int j=0;j<numElementosInderidos;j++){
                System.out.println("Nome: "+vetorDados[j].nome+", Idade: "+vetorDados[j].idade);
            }
        }
    
}
