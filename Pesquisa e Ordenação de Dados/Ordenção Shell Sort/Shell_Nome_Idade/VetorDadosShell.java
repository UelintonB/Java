/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shellPorNome;

/**
 *
 * @author Patrick Guerra
 */
public class VetorDadosShell {
    DadosShell [] vetorDados;
    int numElementosInseridos;

    public VetorDadosShell(int numMax){
        vetorDados = new DadosShell[numMax];
        numElementosInseridos = 0;
    }
    
    public void inserirDados(String nome, int idade){
        vetorDados[numElementosInseridos] = new DadosShell(nome, idade);
        numElementosInseridos++;
    }
    
//    public void inserirDados(DadosShell obj){
//        vetorDados[numElementosInseridos] = obj;
//        numElementosInseridos++;
//    }
    public void imprimirDados(){
        for(int i=0;i<numElementosInseridos;i++){
            System.out.println("Nome= "+vetorDados[i].getNome()+", idade= "+vetorDados[i].getIdade());
        }
    }

    public void setVetorDados(DadosShell[] vetorDados) {
        this.vetorDados = vetorDados;
    }

    public DadosShell[] getVetorDados() {
        return vetorDados;
    }

    public int getNumElementosInseridos() {
        return numElementosInseridos;
    }    
    
}
