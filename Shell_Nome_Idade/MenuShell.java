/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shellPorNome;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class MenuShell {
    VetorDadosShell vetorDados;
    MetodoOrdenacaoShell ordenacao;
    Scanner entradaTeclado = new Scanner(System.in);
    
    
    public void executar(){
        //Scanner input = new Scanner(System.in);
        int opcao = -1;
        do{
            //tela
            System.out.println("\n------------**SHELL[NOME/IDADE]**---------------");
            System.out.println("Nome: Patrick Andrei Caron Guerra");
            System.out.println("--------------------------------------");
            System.out.println("1 - Cadastro de dados");
            System.out.println("2 - Ordenacao Por Nome");
            System.out.println("3 - Ordenacao Por Idade");
            System.out.println("--------------------------------------");
            System.out.println("0 - Sair do Programa");
            System.out.print("Opcao: ");
            opcao = entradaTeclado.nextInt();
            switch(opcao){
                case 0:
                    break;
                case 1:
                    cadastraDados();
                    break;
                case 2:
                    ordenarDadosNome();
                    break;
                case 3:
                    ordenarDadosIdade();
                    break;
                default:
                     opcao = -1;
                     break;
            }
        }while(opcao!=0);
    }
    
    public void cadastraDados(){
        System.out.print("Qual o número de elementos que serão inseridos? ");
        int numMaxElementos = entradaTeclado.nextInt();
        vetorDados = new VetorDadosShell(numMaxElementos);
        for(int i=0;i<numMaxElementos;i++){
            System.out.println("Entrada da "+(i+1)+"° estrutura:\n");
            System.out.print("Digite o nome:");
            String nome = entradaTeclado.next();
            System.out.print("Digite a idade:");
            int idade = entradaTeclado.nextInt();            
            vetorDados.inserirDados(nome, idade);           
        }
        System.out.println("Ordem da estrutura digitada");
         vetorDados.imprimirDados();
    }
    
    public void ordenarDadosNome(){
        System.out.println("\nDados Cadastrados:");
        vetorDados.imprimirDados();
        ordenacao = new MetodoOrdenacaoShell(vetorDados);
        ordenacao.ordenacaoShellPorNome();
        System.out.println("\nDados Ordenados Por Nome:");
        vetorDados.imprimirDados();
        System.out.println("\nTecle enter para sair --->");
        entradaTeclado.nextLine();
        entradaTeclado.nextLine();
    }
    
    public void ordenarDadosIdade(){
        System.out.println("\nDados Cadastrados:");
        vetorDados.imprimirDados();
        ordenacao = new MetodoOrdenacaoShell(vetorDados);
        ordenacao.ordenacaoShellPorIdade();
        System.out.println("\nDados Ordenados Por Idade:");
        vetorDados.imprimirDados();
        System.out.println("\nTecle enter para sair --->");
        entradaTeclado.nextLine();
        entradaTeclado.nextLine();
    }
}
