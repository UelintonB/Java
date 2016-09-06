/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shellPorNome;

/**
 *
 * @author Patrick Guerra
 */
public class DadosShell {
    private String nome;
    private int idade;

    public DadosShell(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
