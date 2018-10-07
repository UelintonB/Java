/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TuringTest.PatrickGuerra.Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrick Guerra
 */
public class Model {

    /**
     * actual: Armazena o proximo indice a ser retornado
     */
    private Integer atual;
    private List<String> respostas; 
    
    public Model() {
        this.atual = 0;
        this.respostas = new ArrayList<>();
    }

    public void setRespostas(List<String> respostas) {
        this.respostas = respostas;
    }
    
    public void inserirResposta(String resposta){
        this.respostas.add(resposta);
    }
    
    public String getResposta(){
        if(this.atual >= this.respostas.size() ){
            atual = 0;
        }
        String valor = this.respostas.get(atual);
        atual++;
        return valor;
    }
    
    public Integer NumeroDeMensagens(){
        return this.respostas.size();
    }
}
