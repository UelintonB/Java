/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.Camadas.negocio;
import br.ufsm.Camadas.dados.LivrosDados;

/**
 *
 * @author Patrick Guerra
 */
public class LivrosNegocio {
    private LivrosDados db = new LivrosDados();
    
    public LivrosDados getDados(){
        return db;
    }
    
    public void inserirDados(String titulo, String autor){
        db.setLivroDados(titulo, autor);
    }
}
