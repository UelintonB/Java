/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11_exe1_patricacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class JogoDotComSimplesTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JogoDotComSimples dotCom = new JogoDotComSimples();
        int[] localizacao = {2,3,4};
        
        dotCom.setLocalizacao(localizacao);
        
        String palpiteJogador = "2";
        String resultado = dotCom.verificaPalpite(palpiteJogador);
        String resultadoTeste = "Falha-JogoDotComSimples";
        if(resultado.equals("acertou"))
            resultadoTeste = "APROVADO-JogoDotComSimples";
        System.out.println(resultadoTeste);
    }

}
