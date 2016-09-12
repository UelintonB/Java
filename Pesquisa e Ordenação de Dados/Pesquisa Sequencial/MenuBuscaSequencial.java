/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buscasequencial;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class MenuBuscaSequencial {
    Scanner entradaTeclado = new Scanner (System.in);
    private int [] vetorDados;
    private int numMaxElementos;
    private int elementosInseridos=0;

    public MenuBuscaSequencial(int numMaxElementos) {
        this.numMaxElementos = numMaxElementos;
        vetorDados = new int[numMaxElementos];
    }
    
    public void execute (){
        int opcao = -1; 
        do{
            System.out.println();
            System.out.println("|--------**Patrick-Guerra**-----------|");
            System.out.println("|Pesquisa Sequencial                  |");
            System.out.println("|-------------------------------------|");
            System.out.println("|1- Cadastrar Dados                   |");
            System.out.println("|2- Pesquisar                         |");
            System.out.println("|3- Imprimir Dados                    |");
            System.out.println("|4- Remover Elemento                  |");
            System.out.println("|-------------------------------------|");
            System.out.println("|0 - Sair do programa                 |");
            System.out.print("--> Digite a opção: ");
            opcao = entradaTeclado.nextInt();
            switch(opcao){
                case 1: 
                    cadastrarDados();
                    break;
                case 2:
                    if(elementosInseridos>0){ //se numero de elementos cadastrados maior que zero
                        pesquisar();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 3:
                    if(elementosInseridos>0){ //se numero de elementos cadastrados maior que zero
                        System.out.println("\nDados Cadastrados: ");
                        for (int i=0; i<elementosInseridos; i++){
                            System.out.print(vetorDados[i]+" ");
                        }
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 4:
                    if(elementosInseridos>0){ //se numero de elementos cadastrados maior que zero
                        removerDados();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
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
        int op=-1,elementoatual;
            do{
                if(elementosInseridos>=numMaxElementos){
                    System.out.println("\nErro: Vetor Cheio!");
                    break;
                }else{
                    elementoatual=(elementosInseridos)+1; 
                    //elementoatual recebe posição atual +1, para exibir corretamente na tela, já que inicia em zero
                    System.out.print("\nDigite o "+elementoatual+"º elemento: ");
                    int numero = entradaTeclado.nextInt();
                    vetorDados[elementosInseridos]=numero;
                    elementosInseridos++;
                    System.out.print("\nDeseja inserir novo elemento? (1-Sim 0-Não):");
                    op=entradaTeclado.nextInt();
                }
            }while(op!=0);    
    }
    
    public void pesquisar(){
        System.out.print("Digite o número a ser buscado: ");
        int elementoBuscado = entradaTeclado.nextInt(); 
        int busca=-1;
        for(int i=0;i<elementosInseridos;i++){
            if(vetorDados[i]==elementoBuscado){
                busca=i;
                break;
            }
        }
        if (busca != -1){
            System.out.println("O número: "+vetorDados[busca]+" foi encontrada na "+(busca+1)+"ª posição!");
        }
        else{
            System.out.println("Elemento não encontrado!");
        }
    }
    
    public void removerDados(){
        System.out.println("Digite o elemento a ser removido: ");
        int elementoBuscado = entradaTeclado.nextInt();
        int i,c=-1;
        for(i=0;i<elementosInseridos;i++){
            if(vetorDados[i]==elementoBuscado){
                c=i;
                while(c<((elementosInseridos)-1)){
                    vetorDados[c]=vetorDados[c+1];
                    c++;
                }
                elementosInseridos--;
                break;
            }
        }
        if(c!=-1){
            System.out.println("O elemento foi encontrado e removido!");
        }else{
            System.out.println("O elemento não foi encontrado e não pode ser removido!");
        }
    }
}
