/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.ia.se.conexaoInternet;

/**
 *
 * @author Patrick Guerra
 */
public class BaseConhecimento {
    private int cabo;
    private int conectividade;
    private int dns;
    private int download;
    private int erro;
    private int ip;
    private int lenta;
    private String navegador;
    private int outro;
    private int problema_IP;
    private int proxy;
    private int site;
    private int acesso_negado;

    public BaseConhecimento() {
        this.cabo = -1;
        this.conectividade = -1;
        this.dns = -1;
        this.download = -1;
        this.erro = -1;
        this.ip = -1;
        this.lenta = -1;
        this.navegador = null;
        this.outro = -1;
        this.problema_IP = -1;
        this.proxy = -1;
        this.site = -1;
        this.acesso_negado = -1;
    }

    public int getAcesso_negado() {
        return acesso_negado;
    }

    public void setAcesso_negado(int acesso_negado) {
        this.acesso_negado = acesso_negado;
    }

    public int getCabo() {
        return cabo;
    }

    public void setCabo(int cabo) {
        this.cabo = cabo;
    }

    public int getConectividade() {
        return conectividade;
    }

    public void setConectividade(int conectividade) {
        this.conectividade = conectividade;
    }

    public int getDns() {
        return dns;
    }

    public void setDns(int dns) {
        this.dns = dns;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    public int getErro() {
        return erro;
    }

    public void setErro(int erro) {
        this.erro = erro;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public int getLenta() {
        return lenta;
    }

    public void setLenta(int lenta) {
        this.lenta = lenta;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public int getOutro() {
        return outro;
    }

    public void setOutro(int outro) {
        this.outro = outro;
    }

    public int getProblema_IP() {
        return problema_IP;
    }

    public void setProblema_IP(int problema_IP) {
        this.problema_IP = problema_IP;
    }

    public int getProxy() {
        return proxy;
    }

    public void setProxy(int proxy) {
        this.proxy = proxy;
    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }
    
    
}
