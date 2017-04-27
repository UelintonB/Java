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
public class Jogo {

    /**
     * @param args the command line arguments
     */
    private JogoAjudante ajudante = new JogoAjudante();
    private ArrayList<DotCom> dotComLista = new ArrayList<DotCom>();
    private int numeroDeTentativas = 0;
    
    private void setUpGame(){
        DotCom um = new DotCom();
        um.setNome("Pets.com");
        DotCom dois = new DotCom();
        dois.setNome("eToys.com");
        DotCom tres = new DotCom();
        tres.setNome("Go2.com");
        dotComLista.add(um);
        dotComLista.add(dois);
        dotComLista.add(tres);
        
        System.out.println("Seu objetivo e eliminar tres dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Tente eliminar todas com o menor numero de palpites possiveis");
        
        for(DotCom dotComToSet : dotComLista){
            ArrayList<String> newLocation = ajudante.placeDotCom(3);
            dotComToSet.setLocalizacaoCelulas(newLocation);
        }
    }
    
    private void startPlaying(){
        while(!dotComLista.isEmpty()){
            String userGuess = ajudante.getUserInput("Insira um palpite");    
            checkUserguess(userGuess);
        }
        finishGame();
    }
    
    private void checkUserguess(String userGuess){
        numeroDeTentativas++;
        String result = "errado";
        for(DotCom dotComToTest : dotComLista){
            result = dotComToTest.verifica(userGuess);
            if(result.equals("correto"))
                break;
            if(result.equals("eliminar")){
                dotComLista.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    
    private void finishGame(){
        System.out.println("Todas as Dot Coms foram eliminadas! Agora seu conjunto está vazio.");
        if(numeroDeTentativas <= 18){
            System.out.println("Voce so usou "+numeroDeTentativas+" palpites.");
            System.out.println("Voce saiu antes de eliminar suas opcoes.");
        }else{
            System.out.println("Demorou demais. "+numeroDeTentativas+" palpites.");
            System.out.println("Nao havera pesca com essas opcoes.");
        }
    }
            
    public static void main(String[] args) {
        Jogo game = new Jogo();
        game.setUpGame();
        game.startPlaying();
    }

}
