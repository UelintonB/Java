/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TuringTest.PatrickGuerra.Storage;

import java.util.HashMap;
import TuringTest.PatrickGuerra.Models.*;
import java.util.Map;
/**
 *
 * @author Patrick Guerra
 */
public class Storage {
    private Map <String, Model> baseDeDados;

    public Storage() {
        this.baseDeDados = new HashMap<>();
    }
    
    public void inserirChave(String chave){
        this.baseDeDados.put(chave, new Model());
    }
    
    public void inserirResposta(String chave, String resposta){
        this.baseDeDados.get(chave).inserirResposta(resposta);
    }
    
    public String getResposta(String chave){
        if(this.baseDeDados.containsKey(chave)){
            return this.baseDeDados.get(chave).getResposta();
        }
        return null;
    }
    
    public Integer getNumeroDeChaves(){
        return this.baseDeDados.size();
    }
    
    public Integer getNumeroMensagens(String chave){
        return this.baseDeDados.get(chave).NumeroDeMensagens();
    }
}
