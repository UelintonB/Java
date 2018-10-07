/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TuringTest.PatrickGuerra.Views;

import TuringTest.PatrickGuerra.Controllers.*;
/**
 *
 * @author Patrick Guerra
 */
public class Entrada extends View{
    Controller controller;

    public Entrada(Controller controller) {
        this.controller = controller;
    }

    public void escolheOpcao(){
        Exibicao view = new Exibicao("inicial", null);
        Integer opcao = getInteger(); 
        do{
            switch(opcao){
                case 1:
                    conversa();
                    break;
                case 2:
                    inserirChave();
                    break;
                case 3:
                    inserirMensagem();
                    break;
                case 0:
                    break;
                default:
                    imprimeErro("Erro: opcao invalida!");
                    break;
            }
            view.inicial();
            opcao = getInteger();
        }while(opcao != 0);
    }
    
    public void conversa(){
        String valor;
        imprimeValor("Digite uma palavra ou mensagem:");
        valor = getString();
        do{
            if(valor.equals("data") || valor.equals("data atual") || valor.equals("hoje")){
                imprimeValor("Hoje e dia: "+getData());
            }else {
                if(valor.equals("hora") || valor.equals("horas") || valor.equals("hora atual")){
                    imprimeValor("A hora atual e: "+getHora());
                }else{
                    String[] frase = valor.split(" ");
                    for (String string : frase) {
                        this.controller.getResposta(string);
                        //imprimePrint(string);
                    }
                    imprimeValor("");
                }
            }
            imprimeValor("Digite uma palavra ou mensagem (Para sair digite:sair):");
            valor = getString();
        }while(!"sair".equals(valor));
    }
    
    public void inserirChave(){
        Integer numeroTotalChaves;
        Integer nTCAtual;
        numeroTotalChaves = this.controller.getNumeroDeChaves();
        imprimeValor("Digite uma palavra chave:");
        String stringTemp = getString();
        this.controller.inserirChave(stringTemp);
        nTCAtual = this.controller.getNumeroDeChaves();
        if(nTCAtual > numeroTotalChaves){
            imprimeValor("Chave Cadastrada!");
        }else{
            imprimeErro("Erro: A chave nao foi cadastrada!");
        }
    }
    
    public void inserirMensagem(){
        Integer numeroTotalMensagens;
        Integer nTMAtual;
        imprimeValor("Digite uma palavra chave: ");
        String chave = getString();
        numeroTotalMensagens = this.controller.getNumeroDeMensagens(chave);
        imprimeValor("Digite uma Mensagem para a chave "+chave+": ");
        String mensagem = getString();
        this.controller.inserirResposta(chave, mensagem);
        nTMAtual = this.controller.getNumeroDeMensagens(chave);
        if(nTMAtual > numeroTotalMensagens){
            imprimeValor("Mensagem Cadastrada!");
        }else{
            imprimeErro("Erro: A mensagem nao foi cadastrada!");
        }
    }
}
