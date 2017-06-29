/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.Conta.negocio;

import br.ufsm.Conta.dados.ContaDados;
import java.util.ArrayList;

/**
 *
 * @author Patrick Guerra
 */
public class ContaNegocio {
    private int index = 0;
    private ArrayList<ContaDados> bd = new ArrayList<ContaDados>();

    public ContaNegocio() {
    }
    
    public void insereConta(ContaDados novo){
        index++;
        bd.add(novo);
    }
    
    public ContaDados getDados(int index){
        return bd.get(index);
    }

    public int getIndex() {
        return index;
    }

}
