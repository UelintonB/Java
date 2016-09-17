/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrickAndreiCaronGuerra;

/**
 *
 * @author Patrick Guerra
 */
public class DadosProva {
    private String nome;
    private int distancia;
    private double valor;

    public DadosProva(String nome, int distancia, double valor) {
        this.nome = nome;
        this.distancia = distancia;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getDistancia() {
        return distancia;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
