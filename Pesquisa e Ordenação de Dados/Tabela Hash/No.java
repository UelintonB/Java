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
public class No {
    private int informacao;
    private No prox;

    public No(int informacao) {
        this.informacao = informacao;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No proximo) {
        this.prox = proximo;
    }

    public int getInformacao() {
        return informacao;
    }
    
    public void imprimeNo(){
        System.out.print(informacao+" ");
    }
    
}
