/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrickAndreiCaronGuerra;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class MenuProva {
    VetorProva vetorDados; 
    Scanner entradaTeclado = new Scanner (System.in);
    MetodosOrdenacaoProva ordenacao;
    int numMaxElementos=6;
    
    public void execute (){
        
        vetorDados = new VetorProva(numMaxElementos); 
        cadastrarDados();
        int opcao = -1; 
        do{
            System.out.println();
            System.out.println("|--------**Patrick-Guerra**-----------|");
            System.out.println("|Prova01                              |");
            System.out.println("|-------------------------------------|");
            System.out.println("|1- Ordenar por Valor                 |");
            System.out.println("|2- Ordenar pela Distancia            |");
            System.out.println("|3- Ordenar por Categorias            |");
            System.out.println("|-------------------------------------|");
            System.out.println("|0 - Sair do programa                 |");
            System.out.print("--> Digite a opção: ");
            opcao = entradaTeclado.nextInt();
            switch(opcao){
                case 1:
                    ordenacao = new MetodosOrdenacaoProva(vetorDados);
                    ordenacao.ordenacaoPorValorQuickSortDecrescente(0, vetorDados.numElementosInseridos-1);
                    System.out.println("\nDados Ordenados Por Valor (decrescente): ");
                    vetorDados.imprimirDados();
                    break;
                case 2:
                        ordenacao = new MetodosOrdenacaoProva(vetorDados);
                        ordenacao.ordenacaoPorDistanciaQuickSortCrescente(0, vetorDados.numElementosInseridos-1);
                        System.out.println("\nDados Ordenados Por Distancia (crescente): ");
                        vetorDados.imprimirDados();
                    break;
                case 3:
                    ordenacao = new MetodosOrdenacaoProva(vetorDados);
                    ordenacao.ordenacaoPorCategorias();
                    System.out.println("\nDados Ordenados Por Categoria: ");
                    vetorDados.imprimirDados();
                    break;
                case 0:
                    break;
                default:
                    opcao = -1;
                    break;
           }
        }while(opcao != 0); 
    }
    
    public void cadastrarDados(){
        vetorDados.inserirDados("Maria",650,620.00);
        vetorDados.inserirDados("Jose",80,100.00);
        vetorDados.inserirDados("Joao",1500,200.00);
        vetorDados.inserirDados("Lucas",850,620.00);
        vetorDados.inserirDados("Marta",1200,250.00);
        vetorDados.inserirDados("Francisco",85,520.00);
    }
    
}
