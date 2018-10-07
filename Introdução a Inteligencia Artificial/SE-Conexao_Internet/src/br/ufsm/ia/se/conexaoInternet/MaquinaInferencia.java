/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.ia.se.conexaoInternet;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Guerra
 */
public class MaquinaInferencia {
    
    private BaseConhecimento baseConhecimento;

    public MaquinaInferencia(){
        this.baseConhecimento = new BaseConhecimento();
    }

    public BaseConhecimento getBaseConhecimento() {
        return baseConhecimento;
    }

    public void setBaseConhecimento(BaseConhecimento baseConhecimento) {
        this.baseConhecimento = baseConhecimento;
    }
    
    public String verifica_cabo()
    {
        if(this.baseConhecimento.getCabo() == 0)
        {
            return "Conecte o cabo.";
        }
        return null;
    }
    
    public String reposta_Ligue_Responsavel_Internet(){
        return "Ligue para o responsável pela sua Internet.";
    }
    
    public String reposta_Chamar_Tecnico(){
        return "Chame um técnico.";
    }
    
    public String verifica_Dados(){
        if((this.baseConhecimento.getConectividade() == 1)
           || 
           (this.baseConhecimento.getErro() == 1)
           )
        {
            return reposta_Ligue_Responsavel_Internet();
        }
        else if(this.baseConhecimento.getAcesso_negado() == 1 && 
                this.baseConhecimento.getProxy() == 1)
        {
            return "Altere o proxy.";
        }
        else if(this.baseConhecimento.getAcesso_negado() == 1 && 
                this.baseConhecimento.getProxy() == 0 &&
                this.baseConhecimento.getNavegador().compareTo("Chrome") == 0)
        {
            return "Chrome (Configurações -> avançadas -> rede -> alterar proxy).";
        }
        else if(this.baseConhecimento.getAcesso_negado() == 1 && 
                this.baseConhecimento.getProxy() == 0 &&
                this.baseConhecimento.getNavegador().compareTo("IE") == 0)
        {
            return "IE (Ferramentas -> opções da Internet -> conexões -> configurações de lan).";
        }
        else if(this.baseConhecimento.getAcesso_negado() == 1 && 
                this.baseConhecimento.getProxy() == 0 &&
                this.baseConhecimento.getNavegador().compareTo("Firefox") == 0)
        {
            return "Firefox (Editar -> preferências -> avançado -> rede).";
        }
        else if(this.baseConhecimento.getAcesso_negado() == 1 && 
                this.baseConhecimento.getProxy() == 0 &&
                this.baseConhecimento.getNavegador().compareTo("Outro") == 0
                )
        {
            return reposta_Chamar_Tecnico();
        }
        else if(this.baseConhecimento.getSite() == 1)
        {
            return "Tente abrir com outro navegador.";
        }
        else if(this.baseConhecimento.getProblema_IP() == 1 &&
                this.baseConhecimento.getIp() == 1)
        {
            return "Verifique se o IP está fixo.";
        }
        else if(this.baseConhecimento.getProblema_IP() == 1 &&
                this.baseConhecimento.getIp() == 0)
        {
            return reposta_Chamar_Tecnico();
        }
        else if(this.baseConhecimento.getDns() == 1)
        {
            return reposta_Ligue_Responsavel_Internet();
        }
        else if(this.baseConhecimento.getLenta() == 1 &&
                this.baseConhecimento.getDownload() == 0)
        {
            return reposta_Ligue_Responsavel_Internet();
        }
        else if(this.baseConhecimento.getLenta() == 1 &&
                this.baseConhecimento.getDownload() == 1)
        {
            return "Está lenta por causa do donwload.";
        }
        else if(this.baseConhecimento.getOutro() == 0)
        {
            return reposta_Chamar_Tecnico();
        }
        return reposta_Chamar_Tecnico();    
    }
}
