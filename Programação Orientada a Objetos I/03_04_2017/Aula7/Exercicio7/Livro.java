/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula7_exe7_patrickacguerra;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class Livro {
    private int idLivro;
    private int [] isbn = new int[13];
    private String nome;
    
    Scanner entrada = new Scanner(System.in);

    void cadastrar(int idLivro, int [] isbn, String nome) {
        this.idLivro = idLivro;
        this.isbn = isbn;
        this.nome = nome;
    }
    //nao utilizada
    int pesquisar(int id, int i){
        if(id == idLivro)
            return i;
        return -1;
    }
    
    boolean excluir(int [] tmp_isbn){
        if(tmp_isbn == isbn){
            idLivro = -1;
            return true;
        }
        return false;
    }
    
    void alterar(int idLivro, int [] isbn, String nome){
        this.idLivro = idLivro;
        this.isbn = isbn;
        this.nome = nome;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public int[] getIsbn() {
        return isbn;
    }

    public String getNome() {
        return nome;
    }

    public Scanner getEntrada() {
        return entrada;
    }
}
