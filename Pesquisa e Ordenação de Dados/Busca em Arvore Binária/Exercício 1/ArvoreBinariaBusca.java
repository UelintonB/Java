/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArvoreBusca;

/**
 *
 * @author Patrick Guerra
 */
public class ArvoreBinariaBusca {
    private No raiz;

    public ArvoreBinariaBusca() {
        raiz = null;
    }
    
    public No busca(int chave){
        No atual = raiz;
        while(atual.informacao != chave){
            if(chave < atual.informacao)
                atual = atual.filhoEsquerdo;
            else
                atual = atual.filhoDireito;
            
            if(atual == null)
                return null;
        }
        return atual;
    }
    
    public void insercao(int info){
        No novoNo = new No();
        novoNo.informacao = info;
        if(raiz==null){
            raiz = novoNo;
        }else{
            No atual = raiz;
            No parent;
            while(true){
                parent = atual;
                if(info < atual.informacao){
                    atual = atual.filhoEsquerdo;
                    if(atual == null){
                        parent.filhoEsquerdo = novoNo;
                        return;
                    }
                }else{
                    atual = atual.filhoDireito;
                    if(atual == null){
                        parent.filhoDireito = novoNo;
                        return;
                    }
                }
            }
            
        }
        
    }

}
