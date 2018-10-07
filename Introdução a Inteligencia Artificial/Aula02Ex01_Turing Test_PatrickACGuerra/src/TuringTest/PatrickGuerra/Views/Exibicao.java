/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TuringTest.PatrickGuerra.Views;

/**
 *
 * @author Patrick Guerra
 */
public class Exibicao extends View{

    public Exibicao(String tipo, String valores) {
        switch(tipo){
            case "inicial":
                inicial();
                break;
            case "exibeMensagem":
                exibeChave(valores);
                break;
            case "exibePrint":
                exibePrint(valores);
                break;
            case "exibeErro":
                exibeErro(valores);
                break;
            default:
                exibeErro("Erro, não foi possivel atender a sua solicitação!");
                System.exit(1);
                break;
        }
    }
    
    public void inicial(){
        System.out.println("Bem Vindo ao Teste de Turing!");
        System.out.println("Escolha um opcao:");
        System.out.println("1 - Iniciar conversa");
        System.out.println("2 - Cadastrar Chave");
        System.out.println("3 - Cadastrar Resposta");
        System.out.println("0 - Sair");
    }
    
    public void exibeChave(String chave){
        imprimeValor(chave);
    }
    
    public void exibeErro(String erro){
        imprimeErro(erro);
    }
    
    public void exibePrint(String valor){
        imprimePrint(valor);
    }
}
