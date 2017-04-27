/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula13_exe2_patrickacguerra;

import java.util.ArrayList;

/**
 *
 * @author Patrick Guerra
 */
public class DotCom {
    private ArrayList<String> localizacaoCelulas;
    private String nome;

    public void setLocalizacaoCelulas(ArrayList<String> localizacaoCelulas) {
        this.localizacaoCelulas = localizacaoCelulas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String verifica(String entradaUsuario){
        String resultado = "errado";
        int indice = localizacaoCelulas.indexOf(entradaUsuario);
        if(indice >= 0){
            localizacaoCelulas.remove(indice);
            if(localizacaoCelulas.isEmpty()){
                resultado = "eliminar";
                
                System.out.println("Ora! Voce afundou "+nome+" :(");
            }else{
                resultado = "correto";
            }
        }
        return resultado;
    }
}
