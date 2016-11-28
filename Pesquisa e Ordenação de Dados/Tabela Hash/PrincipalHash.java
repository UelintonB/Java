/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabelahashvideopatrick;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class PrincipalHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int chave;
        No novoNo;
        
        int []numeros = {0,4,10,13,15,20,31,88};
        
        int tamanhoTabela, numerItensinseridos;
        Scanner entradaTeclado = new Scanner(System.in);
        
        System.out.print("Qual o tamanho da tabela hash? (7) : ");
        tamanhoTabela = entradaTeclado.nextInt();
        
        System.out.print("Qual a quantidade de itens a ser inseridos na tabela hash? (8) : ");
        numerItensinseridos = entradaTeclado.nextInt();
        
        TabelaHash tabelaHash = new TabelaHash(tamanhoTabela);
        
        int j;
        for(j=0;j<numerItensinseridos;j++){
            System.out.print("Entre com o numero "+(j+1)+" :");
            chave = numeros[j];
            novoNo = new No(chave);
            tabelaHash.insereTabelaHash(novoNo);
        }
        
        System.out.println("\nImpressao da tabela Hash");
        tabelaHash.imprimeTabelaHash();
        
        System.out.print("\nEntre com uma chave a ser inserida: ");
        chave = entradaTeclado.nextInt();
        novoNo = new No(chave);
        tabelaHash.insereTabelaHash(novoNo);
        
        System.out.print("\nImpressao da tabela Hash depois de inserir nº");
        tabelaHash.imprimeTabelaHash();
        
        System.out.print("\nEntre com a chave a ser deletada: ");
        chave = entradaTeclado.nextInt();
        tabelaHash.removeTabelaHash(chave);
        
        System.out.println("\nImpressao da tabela Hash");
        tabelaHash.imprimeTabelaHash();
        
        System.out.print("\nEntre com a chave para pesquisa: ");
        chave = entradaTeclado.nextInt();
        novoNo = tabelaHash.buscaTabelaHash(chave);
        if(novoNo != null){
            System.out.println("\nChave encontrada: "+chave);
        }else{
            System.out.println("\nChave NAO encontrada: "+chave);
        }
    }

}
