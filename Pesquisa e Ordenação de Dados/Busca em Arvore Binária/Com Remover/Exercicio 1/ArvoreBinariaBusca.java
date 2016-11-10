/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg01arvorebinariadebuscaremoverpatrick;

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
        while(atual.getInfo() != chave){
            if(chave < atual.getInfo())
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
        novoNo.setInfo(info);
        if(raiz==null){
            raiz = novoNo;
        }else{
            No atual = raiz;
            No parent;
            while(true){
                parent = atual;
                if(info < atual.getInfo()){
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
    
    private No getSucessor(No delNo){
        No sucessorParent = delNo;
        No sucessor = delNo;
        No corrente = delNo.getFilhoDireito();
        
        while(corrente != null){
            sucessorParent = sucessor;
            sucessor = corrente;
            corrente = corrente.getFilhoEsquerdo();
        }
        
        if(sucessor != delNo.getFilhoDireito()){
            sucessorParent.setFilhoEsquerdo(sucessor.getFilhoDireito());
            sucessor.setFilhoDireito(delNo.getFilhoDireito());
        }
        
        return sucessor;
    }
    
    public void remover(int chave){   
        No corrente = raiz;
        No pai = raiz;
        boolean ehFilhoEsquerdo = true;
        
        while(corrente.getInfo() != chave){
            pai = corrente;
            if(chave < corrente.getInfo()){
                ehFilhoEsquerdo = true;
                corrente = corrente.getFilhoEsquerdo();
            }else{
                ehFilhoEsquerdo = false;
                corrente = corrente.getFilhoDireito();
            }
            
            if(corrente == null)
                //return false;
                break;
        }
        
        if(corrente.getFilhoEsquerdo() == null && corrente.getFilhoDireito() == null){
            if(corrente == raiz){
                raiz = null;
            }else{
                if(ehFilhoEsquerdo){
                    pai.setFilhoEsquerdo(null);
                }else{
                    pai.setFilhoDireito(null);
                }
            }
        }else{
            if(corrente.getFilhoDireito() == null){
                if(corrente == raiz){
                    raiz = corrente.getFilhoEsquerdo();
                }else{
                    if(ehFilhoEsquerdo){
                        pai.setFilhoEsquerdo(corrente.getFilhoEsquerdo());
                    }else{
                        pai.setFilhoDireito(corrente.getFilhoEsquerdo());
                    }
                }
            }else{
                if(corrente.getFilhoEsquerdo() == null){
                    if(corrente == raiz){
                        raiz = corrente.getFilhoDireito();
                    }else{
                        if(ehFilhoEsquerdo){
                            pai.setFilhoEsquerdo(corrente.getFilhoDireito());
                        }else{
                            pai.setFilhoDireito(corrente.getFilhoDireito());
                        }
                    }
                }else{
                    No sucessor = getSucessor(corrente);
                    
                    if(corrente == raiz){
                        raiz = sucessor;
                    }else{
                        if(ehFilhoEsquerdo){
                            pai.setFilhoEsquerdo(sucessor);
                        }else{
                            pai.setFilhoDireito(corrente);
                        }
                    }
                    
                    sucessor.setFilhoEsquerdo(corrente.getFilhoEsquerdo());
                }
            }
        }   
    }
}
