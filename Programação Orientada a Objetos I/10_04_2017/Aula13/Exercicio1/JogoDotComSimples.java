/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula13_exe1_patrickacguerra;

import java.util.ArrayList;

/**
 *
 * @author Patrick Guerra
 */
public class JogoDotComSimples {
    private ArrayList<String> localizacao;

    public void setLocalizacao(ArrayList<String> localizacao) {
        this.localizacao = localizacao;
    }
    
    public String verificaPalpite(String palpiteString){
        String resultado = "Errou!";
        int indice = localizacao.indexOf(palpiteString);
        if(indice >= 0){
            localizacao.remove(indice);
            if(localizacao.isEmpty()){
                resultado = "DotCom-eliminada";
            }else{
                resultado = "Acertou.......";
            }
        }
        System.out.println(resultado);
        return resultado;
    }
}
