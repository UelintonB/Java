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
public class ListaEncadeada {
    private No no;

    public ListaEncadeada() {
        no = null;
    }
    
    public void inserelistaEncadeada(No novoNo){
        int chave = novoNo.getInformacao();
        No anteriorNo = null;
        No atualNo = no;
        
        while(atualNo != null && chave > atualNo.getInformacao()){
            anteriorNo = atualNo;
            atualNo = atualNo.getProx();
        }
        
        if(anteriorNo == null){
            no = novoNo;
        }else{
            anteriorNo.setProx(novoNo);
        }
        
        novoNo.setProx(atualNo);
    }
    
    public void deleteListaEncadeada(int chave){
        No anteriorNo = null;
        No atualNo = no;
        
        while(atualNo != null && chave != atualNo.getInformacao()){
            anteriorNo = atualNo;
            atualNo = atualNo.getProx();
        }
        
        if(anteriorNo == null){
            no = no.getProx();
        }else{
            anteriorNo.setProx(atualNo.getProx());
        }
    }
    
    public No buscaListaEncadeada(int chave){
        No atualNo = no;
        
        while(atualNo != null && atualNo.getInformacao() <= chave){
            if(atualNo.getInformacao() == chave){
                return atualNo;
            }
            atualNo = atualNo.getProx();
        }
        
        return null;
    }
    
    public void imprimeListaEncadeada(){
        System.out.print("Lista (Primeiro-->Ultimo): ");
        No atualNo = no;
        while(atualNo != null){
            atualNo.imprimeNo();
            atualNo = atualNo.getProx();
        }
        System.out.println();
    }
}
