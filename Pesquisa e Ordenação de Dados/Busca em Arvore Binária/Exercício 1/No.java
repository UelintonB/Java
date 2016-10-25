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
public class No {
    public int informacao;
    public No filhoEsquerdo;
    public No filhoDireito;
    
    public void imprimeNo(){
        System.out.print('{');
        System.out.print(informacao);
        System.out.print('}');
    }
}
