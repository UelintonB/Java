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
public class No {
    
    private int informacao;
    private No filhoEsquerdo;
    private No filhoDireito;

    public int getInformacao() {
        return informacao;
    }

    public void setInformacao(int informacao) {
        this.informacao = informacao;
    }

    public No getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(No filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public No getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(No filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
    
    public void imprimeNo(){
        System.out.print('{');
        System.out.print(informacao);
        System.out.print('}');
    }
}
