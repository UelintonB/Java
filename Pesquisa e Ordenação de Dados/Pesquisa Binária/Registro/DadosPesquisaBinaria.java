/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PesquisaBinaria;

/**
 *
 * @author Patrick Guerra
 */
public class DadosPesquisaBinaria {
    private String nome;
    private int idade;
    private double renda;

    public DadosPesquisaBinaria(String nome, int idade, double renda) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }
    
    public int getIdade(){
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getRenda() {
        return renda;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}
