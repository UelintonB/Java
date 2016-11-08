/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arvorebinariadebuscapatrick3;

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
        while(atual.getIdade() != chave){
            if(chave < atual.getIdade())
                atual = atual.getFilhoEsquerdo();
            else
                atual = atual.getFilhoDireito();
            
            if(atual == null)
                return null;
        }
        return atual;
    }
    
    public void insercao(int idade, String nome){
        No novoNo = new No();
        novoNo.setIdade(idade);
        novoNo.setNome(nome);
        if(raiz==null){
            raiz = novoNo;
        }else{
            No atual = raiz;
            No parent;
            while(true){
                parent = atual;
                if(idade < atual.getIdade()){
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
    
    public void imprimirArvoreEmOrdem(){
        emOrdem(raiz);
    }
    
    public void emOrdem(No raizLocal){
        if(raizLocal != null){
            emOrdem(raizLocal.getFilhoEsquerdo());
            raizLocal.imprimeNo();
            emOrdem(raizLocal.getFilhoDireito());
        }
    }

}
