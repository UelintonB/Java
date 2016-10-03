/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ordenacao.quicksort.nome.iddade;

import java.util.Scanner;
/**
 *
 * @author patri
 */
public class InterfaceOrdenacao {
    VetorDados vetorDados;
    MetodoQuickSortIdade ordenacaoidade;
    MetodoQuickSortNome ordenacaonome;
    Scanner entradaTeclado = new Scanner(System.in);
    
    public void execute(){
        System.out.print("Digite o tamanho maximo de registros: ");
        int max = entradaTeclado.nextInt();
        vetorDados = new VetorDados(max);
        int i=-1;
        while(i!=0){
            System.out.println("\n------------**QuickSort**---------------");
            System.out.println("Nome: Patrick Andrei Caron Guerra");
            System.out.println("--------------------------------------");
            System.out.println("1 - Cadastro de dados");
            System.out.println("2 - Ordenacao Por Nome");
            System.out.println("3 - Ordenacao Por Idade");
            System.out.println("--------------------------------------");
            System.out.println("0 - Sair do Programa");
            System.out.print("Opcao: ");
            i = entradaTeclado.nextInt();
            switch(i){
                case 1: 
                    cadastroDados(); 
                    break;
                case 2: 
                    ordenaDadosPorNome(); 
                    break;
                case 3: 
                    ordenaDadosPorIdade(); 
                    break;
                default:
                    break;
            }
        }
    }
    
    public void cadastroDados(){
        System.out.print("Digite o nome: ");
        entradaTeclado.nextLine();
        String nome = entradaTeclado.nextLine();
        System.out.print("Digite a idade: ");
        int idade = entradaTeclado.nextInt();
        vetorDados.inserirDados(nome,idade);
    }
    
    public void ordenaDadosPorNome(){
        System.out.println("Vetor atualmente:");
        vetorDados.imprime();
        
        System.out.println("\nVetor Ordenado Por Nome:");
        ordenacaonome = new MetodoQuickSortNome(vetorDados);
        ordenacaonome.chamaOrdenacaoNome();
        vetorDados.imprime();
        System.out.print("\nTecle Enter Para Voltar ");
        entradaTeclado.nextLine();//limpa buffer
        entradaTeclado.nextLine();//le uma linha
    } 
    
    public void ordenaDadosPorIdade(){
        System.out.println("Vetor atualmente:");
        vetorDados.imprime();
        
        System.out.println("\nVetor Ordenado Por Idade:");
        ordenacaoidade = new MetodoQuickSortIdade(vetorDados);
        ordenacaoidade.chamaOrdenacaoIdade();
        vetorDados.imprime();
        System.out.print("\nTecle Enter Para Voltar ");
        entradaTeclado.nextLine();//limpa buffer
        entradaTeclado.nextLine();//le uma linha
    }
    
}
