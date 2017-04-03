/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio12patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class endereco_Aluno {
    int tipo;
    String endereco;
    String bairro;
    String uf;
    String cep;
    String telefone;
    String telefone_contato;
    String e_mail;

    public endereco_Aluno(int tipo, String endereco, String bairro, String uf, String cep, String telefone, String telefone_contato, String e_mail) {
        this.tipo = tipo;
        this.endereco = endereco;
        this.bairro = bairro;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.telefone_contato = telefone_contato;
        this.e_mail = e_mail;
    }

    public String converte_tipo(int tipo){
        if(tipo == 1) 
            return "Casa";
        return "Apartamento"; 
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTelefone_contato(String telefone_contato) {
        this.telefone_contato = telefone_contato;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public int getTipo() {
        return tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTelefone_contato() {
        return telefone_contato;
    }

    public String getE_mail() {
        return e_mail;
    }
    
    
}
