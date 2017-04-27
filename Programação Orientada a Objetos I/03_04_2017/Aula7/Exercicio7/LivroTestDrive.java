/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula7_exe7_patrickacguerra;

import java.util.Random;

/**
 *
 * @author Patrick Guerra
 */
public class LivroTestDrive {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        Livro [] livros = new Livro[4];
        int i;
        int j;
        int tamanho = 4;
        int [] isbn;
        int c;
        boolean sucesso;
        
        for(i=0;i<tamanho;i++){
            livros[i] = new Livro();
            int [] numero = new int[13];
            for(j=0;j<13;j++){
                Random gerador = new Random();
                numero[j] = gerador.nextInt(10);
            }
            Random gerador = new Random();
            livros[i].cadastrar(i+1, numero, "Java "+gerador.nextInt(100));
        }
        //print
        System.out.println("Livros Cadastrados:");
        for(i = 0; i < tamanho; i++){
            if(livros[i].getIdLivro() != -1){
                System.out.print("Id: "+livros[i].getIdLivro()+", ISBN: ");
                j = 0;
                isbn = livros[i].getIsbn();
                System.out.printf("%d%d%d-%d-%d%d-%d%d%d%d-%d, Nome: %s\n",isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],livros[i].getNome());
                System.out.println("------------------------------------------------");
            }
        }
        //Exclui livro com id = 3, pesquisando pelo isbn
        System.out.printf("\nExclui livro com id = 3, pesquisando pelo isbn\n");
        isbn = livros[2].getIsbn();
        i = 0;
        for(i = 0; i < tamanho; i++){
            int [] atual_isbn = livros[i].getIsbn();
            c = 0;
            for(j=0;j<13;j++){
                if(isbn[j] == atual_isbn[j])
                    c++;
            }
            if(c==13){
                sucesso = livros[i].excluir(atual_isbn);
                if(sucesso == true){
                    System.out.println("Exclusao realizada com sucesso!");
                    break;
                }else{
                    System.out.println("Livro nao foi excluido");
                }
            }  
        }
        //print again
        System.out.printf("\nLivros Cadastrados:\n");
        for(i = 0; i < tamanho; i++){
            if(livros[i].getIdLivro() != -1){
                System.out.print("Id: "+livros[i].getIdLivro()+", ISBN: ");
                j = 0;
                isbn = livros[i].getIsbn();
                System.out.printf("%d%d%d-%d-%d%d-%d%d%d%d-%d, Nome: %s\n",isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],livros[i].getNome());
                System.out.println("------------------------------------------------");
            }
        }
        //Alteracao do nome livro com id = 1, pesquisando isbn
        System.out.printf("\nAlteracao do nome livro com id = 1, pesquisando isbn\n");
        isbn = livros[0].getIsbn();
        i = 0;
        for(i = 0; i < tamanho; i++){
            int [] atual_isbn = livros[i].getIsbn();
            c = 0;
            for(j=0;j<13;j++){
                if(isbn[j] == atual_isbn[j])
                    c++;
            }
            if(c==13){
                livros[i].alterar(livros[i].getIdLivro(),livros[i].getIsbn(),"C++ 10");
                System.out.println("Alteracao do nome realizada com sucesso!");
            }  
        }
        //print again
        System.out.printf("\nLivros Cadastrados:\n");
        for(i = 0; i < tamanho; i++){
            if(livros[i].getIdLivro() != -1){
                System.out.print("Id: "+livros[i].getIdLivro()+", ISBN: ");
                j = 0;
                isbn = livros[i].getIsbn();
                System.out.printf("%d%d%d-%d-%d%d-%d%d%d%d-%d, Nome: %s\n",isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],isbn[j++],livros[i].getNome());
                System.out.println("------------------------------------------------");
            }
        }
    }
}
