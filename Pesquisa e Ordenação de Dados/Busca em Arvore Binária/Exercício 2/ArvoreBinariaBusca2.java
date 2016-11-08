/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arvorebinariadebuscapatrick2;

/**
 *
 * @author Patrick Guerra
 */
public class ArvoreBinariaBusca2 {
    private No raiz;

    public ArvoreBinariaBusca2() {
        raiz = null;
    }
    
    public No busca(int chave){
        No atual = raiz;
        while(atual.getInformacao() != chave){
            if(chave < atual.getInformacao())
                atual = atual.getFilhoEsquerdo();
            else
                atual = atual.getFilhoDireito();
            
            if(atual == null)
                return null;
        }
        return atual;
    }
    
    public void insercao(int info){
        No novoNo = new No();
        novoNo.setInformacao(info);
        if(raiz==null){
            raiz = novoNo;
        }else{
            No atual = raiz;
            No parent;
            while(true){
                parent = atual;
                if(info < atual.getInformacao()){
                    atual = atual.getFilhoEsquerdo();
                    if(atual == null){
                        parent.setFilhoEsquerdo(novoNo);
                        return;
                    }
                }else{
                    atual = atual.getFilhoDireito();
                    if(atual == null){
                        parent.setFilhoDireito(novoNo);
                        return;
                    }
                }
            }
            
        }
        
    }
}
