/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabelahashvideopatrick;

/**
 *
 * @author Patrick Guerra
 */
public class TabelaHash {
    private ListaEncadeada[] vetorTabelaHash;
    private int tamanhoTabela;

    public TabelaHash(int tamanho) {
        this.tamanhoTabela = tamanho;
        vetorTabelaHash = new ListaEncadeada[tamanhoTabela];
        int j;
        for(j=0;j<tamanhoTabela;j++){
            vetorTabelaHash[j] = new ListaEncadeada();
        }
    }
    
    public void imprimeTabelaHash(){
        int j;
        for(j=0;j<tamanhoTabela;j++){
            System.out.print(j + ". ");
            vetorTabelaHash[j].imprimeListaEncadeada();
        }
    }
    
    public int funcaoHash(int key){
        return key % tamanhoTabela;
    }
    
    public void insereTabelaHash(No novoNo){
        int chave = novoNo.getInformacao();
        int indiceTabelaHash = funcaoHash(chave);
        vetorTabelaHash[indiceTabelaHash].inserelistaEncadeada(novoNo);
    }
    
    public void removeTabelaHash(int chave){
        int indiceTabelaHash = funcaoHash(chave);
        vetorTabelaHash[indiceTabelaHash].deleteListaEncadeada(chave);
    }
    
    public No buscaTabelaHash(int chave){
        int indiceTabelaHash = funcaoHash(chave);
        No novoNo = vetorTabelaHash[indiceTabelaHash].buscaListaEncadeada(chave);
        return novoNo;
    }
}
