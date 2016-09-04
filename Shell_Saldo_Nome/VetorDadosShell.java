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
public class VetorDadosShell {
    DadosShell [] vetorDados;
    int numElementosInseridos;

    public VetorDadosShell(int numMax){
        vetorDados = new DadosShell[numMax];
        numElementosInseridos = 0;
    }
    
    public void inserirDados(int numero_da_conta, double saldo, double limite, String nome){
        vetorDados[numElementosInseridos] = new DadosShell(numero_da_conta, saldo, limite, nome);
        numElementosInseridos++;
    }
    
    public void imprimirDados(){
        for(int i=0;i<numElementosInseridos;i++){
            System.out.print("Número da Conta: "+vetorDados[i].getNumero_da_conta());
            System.out.print(", Nome: "+vetorDados[i].getNome()+", Saldo: "+vetorDados[i].getSaldo());
            System.out.println(", Limite: "+vetorDados[i].getLimite());
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
