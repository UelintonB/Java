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
public class Jogo {

    static JogoAjudante ajudante;
    static JogoDotComSimples dotCom;
    public static void main(String[] args) {
        int totalPaliptes = 0;
        ajudante = new JogoAjudante();
        dotCom = new JogoDotComSimples();
        int numeroAleatorio = (int)(Math.random())*5;
        ArrayList<String> localizacao = new ArrayList<String>();
        localizacao.add(String.valueOf(numeroAleatorio));
        localizacao.add(String.valueOf(numeroAleatorio+1));
        localizacao.add(String.valueOf(numeroAleatorio+2));
        dotCom.setLocalizacao(localizacao);
        while(true){
            String palpiteJogador = ajudante.getEntradaJogador("insira um numero: ");
            String resultado = dotCom.verificaPalpite(palpiteJogador);
            totalPaliptes++;
            if(resultado.equals("DotCom-eliminada")){
                System.out.println("voce usou "+ totalPaliptes + ", palpites.");
                break;
            }
        }
    }

}
