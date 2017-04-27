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
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalPalpites = 0;
        JogoAjudante ajudante = new JogoAjudante();
        JogoDotComSimples dotCom = new JogoDotComSimples();
        int numeroAleatorio = (int)(Math.random()*5);
        int[] localizacao = {numeroAleatorio,numeroAleatorio+1,numeroAleatorio+2};
        dotCom.setLocalizacao(localizacao);
        boolean jogoAtivo = true;
        while(jogoAtivo){
            String palpiteJoogador = ajudante.getEntradaJogador("insira um numero: ");
            String resultado = dotCom.verificaPalpite(palpiteJoogador);
            totalPalpites++;
            if(resultado.equals("DotCom-eliminada")){
                jogoAtivo = false;
                System.out.println("voce usou "+totalPalpites+" palpites");
            }
        }
    }

}
