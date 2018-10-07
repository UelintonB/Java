/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TuringTest.PatrickGuerra.Controllers;

import TuringTest.PatrickGuerra.Storage.*;
import TuringTest.PatrickGuerra.Views.Exibicao;
/**
 *
 * @author Patrick Guerra
 */
public class Controller {
    private Storage conexao;

    public Controller() {
        this.conexao = new Storage();
    }
    
    public void inserirResposta(String chave, String resposta){
        this.conexao.inserirResposta(chave, resposta);
    }
    
    public void inserirChave(String chave){
        this.conexao.inserirChave(chave);
    }
    
    public void getResposta(String chave){
        String resposta;
        resposta = this.conexao.getResposta(chave);
        if(resposta == null){
            //Exibicao exibirErro;
            //exibirErro = new Exibicao("exibeErro", " ");
        }else{
            Exibicao exibirMensagem;
            exibirMensagem = new Exibicao("exibePrint", resposta+" ");
        }
    }
    
    public Integer getNumeroDeChaves(){
        return this.conexao.getNumeroDeChaves();
    }
    
    public Integer getNumeroDeMensagens(String chave){
        return this.conexao.getNumeroMensagens(chave);
    }
}
