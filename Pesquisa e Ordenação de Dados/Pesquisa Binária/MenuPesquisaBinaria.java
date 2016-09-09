/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PesquisaBinaria;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class MenuPesquisaBinaria {
    VetorPesquisaBinaria vetorDados; // cria a referencia para receber o objeto dado
    Scanner entradaTeclado = new Scanner (System.in);
    MetodoOrdenacaoShellSort ordenacao;
    int numMaxElementos;
    int existemElementos;
    int ultimaOrdenacao=-1;
    
    public void execute (){
        System.out.print("Qual é o numero total de elementos a serem inseridos?");
        numMaxElementos = entradaTeclado.nextInt();
        
        vetorDados = new VetorPesquisaBinaria (numMaxElementos);
        MetodoPesquisaBinaria metodoPesquisaBinaria = new MetodoPesquisaBinaria(vetorDados);
        int opcao = -1; 
        do{
            System.out.println();
            System.out.println("|--------**Patrick-Guerra**-----------|");
            System.out.println("|Pesquisa Binaria [NOME|RENDA];[IDADE]|");
            System.out.println("|-------------------------------------|");
            System.out.println("|1- Cadastrar de Dados                |");
            System.out.println("|2- Ordenar por Nome                  |");
            System.out.println("|3- Ordenar por Renda                 |");
            System.out.println("|4- Pesquisar por Nome                |");
            System.out.println("|5- Pesquisar por Renda               |");
            System.out.println("|6- Imprimir Dados                    |");
            System.out.println("|7- Remover Elemento por Idade        |");
            System.out.println("|-------------------------------------|");
            System.out.println("|0 - Sair do programa                 |");
            System.out.print("--> Digite a opção: ");
            opcao = entradaTeclado.nextInt();
            existemElementos=verificaSeExistemDados();
            switch(opcao){
                case 1: 
                    cadastrarDados();
                    break;
                case 2:
                    if(existemElementos>0){
                        ordenacao = new MetodoOrdenacaoShellSort(vetorDados);
                        ordenacao.ordenacaoShellPorNome();
                        ultimaOrdenacao=2;
                        System.out.println("\nDados Ordenados Por Nome: ");
                        vetorDados.imprimirDados();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 3:
                    if(existemElementos>0){
                        ordenacao = new MetodoOrdenacaoShellSort(vetorDados);
                        ordenacao.ordenacaoShellRenda();
                        ultimaOrdenacao=3;
                        System.out.println("\nDados Ordenados Por Renda: ");
                        vetorDados.imprimirDados();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 4:
                    if(existemElementos>0){
                        if(ultimaOrdenacao==2){
                            pesquisarNome();
                        }else{
                            System.out.println("\nErro: Ordene os dados Por Nome, antes de usar essa opção!");
                        }
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 5:
                    if(existemElementos>0){
                        if(ultimaOrdenacao==2){
                            pesquisarRenda();
                        }else{
                            System.out.println("\nErro: Ordene os dados Por Renda, antes de usar essa opção!");
                        }
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 6:
                    if(existemElementos>0){
                        System.out.println("\nDados Cadastrados: ");
                        vetorDados.imprimirDados();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 7:
                    removerDados();
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
                if(existemElementos>=numMaxElementos){
                    System.out.println("\nVetor Cheio!");
                }else{
                    if(existemElementos==0){
                        elementoatual=1;
                    }else{
                        elementoatual=existemElementos;
                    }
                    System.out.print("\n"+(elementoatual)+"º elemento:\nDigite o nome: ");
                    entradaTeclado.nextLine();
                    String nome = entradaTeclado.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = entradaTeclado.nextInt();
                    System.out.print("Digite a renda: ");
                    double renda = entradaTeclado.nextDouble();
                    vetorDados.inserirDados(nome,idade,renda);
                    existemElementos++;
                }
            }while(op!=0);    
    }
    
    public void pesquisarNome(){
        System.out.print("Digite o nome a ser buscado: ");
        entradaTeclado.nextLine();
        String elementoBuscado = entradaTeclado.nextLine();//nome
        
        MetodoPesquisaBinaria pesquisa = new MetodoPesquisaBinaria(vetorDados);
        
        int busca = pesquisa.buscaBinariaNome(elementoBuscado);
        
        if (busca != -1){
            //int tmp=vetorDados.getValorByID(busca).hashCode();
            //tmp++;
            System.out.println("O nome: "+vetorDados.getValorByID(busca).getNome()+" foi encontrado na posição["+(busca+1)+"]!");
        }
        else{
            System.out.println("Elemento/Nome não encontrado!");
        }
    }
    
    public void pesquisarRenda(){
        System.out.print("Digite a Renda a ser buscada: ");
        double elementoBuscado = entradaTeclado.nextDouble();//Renda
        //System.out.println("\nelemento buscado: "+elementoBuscado);
        MetodoPesquisaBinaria pesquisa = new MetodoPesquisaBinaria(vetorDados);
        
        int busca = pesquisa.buscaBinariaRenda(elementoBuscado);
        
        if (busca != -1){
            //int tmp=vetorDados.getValorByID(busca).hashCode();
            //tmp++;
            System.out.println("A Renda: "+ vetorDados.getValorByID(busca).getRenda()+" foi encontrada na posição["+(busca+1)+"]!");
        }
        else{
            System.out.println("Elemento não encontrado!");
        }
    }
    
    public void removerDados(){
        System.out.println("Digite o elemento a ser removido através da idade: ");
        int elementoBuscado = entradaTeclado.nextInt();
        //MetodoPesquisaBinaria pesquisa = new MetodoPesquisaBinaria(vetorDados);
        //VetorPesquisaBinaria vetor = vetorDados.getVetorDados();
        int i,c=-1;
        for(i=0;i<vetorDados.getNumElementosInseridos();i++){
            if(vetorDados.getValorByID(i).getIdade()==elementoBuscado){
                c=i;
                while(c<(vetorDados.getNumElementosInseridos()-1)){
                    vetorDados.setValorByID(c,vetorDados.getValorByID(c+1));
                    c++;
                }
                vetorDados.decrementaNumElementosInseridos();
                break;
            }
        }
        if(c!=-1){
            vetorDados.setValorPosicaoLivre(c);
            System.out.println("O elemento foi encontrado e removido!");
        }else{
            System.out.println("O elemento não foi encontrado e não pode ser removido!");
        }
// fazer para procima aula 
        // fazer para proxima aula!! - remover pela idade 
    }
    
    public int verificaSeExistemDados(){
        //int verificacao=vetorDados.getNumElementosInseridos();
        return vetorDados.getNumElementosInseridos();
    }
}
