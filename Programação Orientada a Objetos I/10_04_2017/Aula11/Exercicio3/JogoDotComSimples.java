/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11_exe3_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class JogoDotComSimples {
    int [] localizacao;
    int numeroDeAcertos = 0;

    public void setLocalizacao(int[] localizacao) {
        this.localizacao = localizacao;
    }
    
    public String verificaPalpite(String palpiteString){
        int palpite = Integer.parseInt(palpiteString);
        String resultado = "errou";
        for(int i=0; i<localizacao.length; i++){
            if(palpite == localizacao[i]){
                resultado = "acertou";
                localizacao[i] = -1;
                numeroDeAcertos++;
                break;
            }
        }
        if(numeroDeAcertos == localizacao.length){
            resultado = "DotCom-eliminada";
        }
        System.out.println(resultado);
        return resultado;
    }

    public int[] getLocalizacao() {
        return localizacao;
    } 
}
