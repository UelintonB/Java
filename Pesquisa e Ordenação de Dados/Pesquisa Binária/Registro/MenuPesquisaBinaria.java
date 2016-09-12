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
    VetorPesquisaBinaria vetorDados; //cria o ponteiro(NãO), digo a referencia vetorDados para receber um objeto (do tipo VetorPesquisaBinaria)
    Scanner entradaTeclado = new Scanner (System.in);
    MetodoOrdenacaoShellSort ordenacao;
    int numMaxElementos;
    int existemElementos;
    int ultimaOrdenacao=-1;
    
    public void execute (){
        System.out.print("Qual é o numero total de elementos a serem inseridos? ");
        numMaxElementos = entradaTeclado.nextInt();
        
        vetorDados = new VetorPesquisaBinaria (numMaxElementos); 
        /*--Inicio da Explicação-- da linha 27:
        1-vetorDados cria uma instancia da classe VetorPesquisaBinaria, 
        2-chama o construtor da classe VetorPesquisaBinaria, mandando como parametro o numeroMáximo,
        3-o construtor vai criar la na outra classe(VetorPesquisaBinaria): 
        DadosPesquisaBinaria[] vetorDados; e int numElementosInseridos;
        4-Guardar essa instancia da classe VetorPesquisaBinaria, no ponteiro(não), digo na referência vetorDados.
        --Fim da Explicação--*/
        int opcao = -1; 
        do{
            System.out.println();
            System.out.println("|--------**Patrick-Guerra**-----------|");
            System.out.println("|Pesquisa Binaria [NOME|RENDA];[IDADE]|");
            System.out.println("|-------------------------------------|");
            System.out.println("|1- Cadastrar Dados                   |");
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
                        ultimaOrdenacao=2; //define ultima ordenação por Nome
                        System.out.println("\nDados Ordenados Por Nome: ");
                        vetorDados.imprimirDados();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 3:
                    if(existemElementos>0){ //se numero de elementos cadastrados maior que zero
                        ordenacao = new MetodoOrdenacaoShellSort(vetorDados);
                        ordenacao.ordenacaoShellRenda();
                        ultimaOrdenacao=3; //define ultima ordenação por Renda
                        System.out.println("\nDados Ordenados Por Renda: ");
                        vetorDados.imprimirDados();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 4:
                    if(existemElementos>0){ //se numero de elementos cadastrados maior que zero
                        if(ultimaOrdenacao==2){ //ultima ordenação foi por Nome?
                            pesquisarNome();
                        }else{
                            System.out.println("\nErro: Ordene os dados Por Nome, antes de usar essa opção!");
                        }
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 5:
                    if(existemElementos>0){ //se numero de elementos cadastrados maior que zero
                        if(ultimaOrdenacao==3){ //ultima ordenação foi por Renda?
                            pesquisarRenda();
                        }else{
                            System.out.println("\nErro: Ordene os dados Por Renda, antes de usar essa opção!");
                        }
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 6:
                    if(existemElementos>0){ //se numero de elementos cadastrados maior que zero
                        System.out.println("\nDados Cadastrados: ");
                        vetorDados.imprimirDados();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 7:
                    if(existemElementos>0){ //se numero de elementos cadastrados maior que zero
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
                existemElementos=verificaSeExistemDados(); //pega numero de elementos inseridos
                /*--Inicio da Explicação-- Sempre que são cadastrados novos elementos o contador fica numa posição a mais, por iniciar no zero.
                Então quando ele estiver igual ou maior(somente com algum erro de execução) ao numero maximo de elementos, 
                não deve-se mais inserir dados pois o vetor está cheio.
                --Fim da Explicação--*/
                if(existemElementos>=numMaxElementos){
                    System.out.println("\nErro: Vetor Cheio!");
                    break;
                }else{
                    elementoatual=(existemElementos)+1; 
                    //elementoatual recebe posição atual +1, para exibir corretamente na tela, já que inicia em zero
                    System.out.print("\n"+elementoatual+"º elemento:\nDigite o nome: ");
                    entradaTeclado.nextLine();
                    String nome = entradaTeclado.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = entradaTeclado.nextInt();
                    System.out.print("Digite a renda: ");
                    double renda = entradaTeclado.nextDouble();
                    vetorDados.inserirDados(nome,idade,renda);
                    existemElementos++;
                    System.out.print("\nDeseja inserir novo elemento? (1-Sim 0-Não):");
                    op=entradaTeclado.nextInt();
                }
            }while(op!=0);    
    }
    
    public void pesquisarNome(){
        System.out.print("Digite o nome a ser buscado: ");
        entradaTeclado.nextLine();
        String elementoBuscado = entradaTeclado.nextLine(); //nome
        
        MetodoPesquisaBinaria pesquisa = new MetodoPesquisaBinaria(vetorDados);
        
        int busca = pesquisa.buscaBinariaNome(elementoBuscado);
        
        if (busca != -1){
            System.out.println("O nome: "+vetorDados.getValorByID(busca).getNome()+" foi encontrado na "+(busca+1)+"ª posição!");
        }
        else{
            System.out.println("Elemento/Nome não encontrado!");
        }
    }
    
    public void pesquisarRenda(){
        System.out.print("Digite a Renda a ser buscada: ");
        double elementoBuscado = entradaTeclado.nextDouble(); //Renda
        MetodoPesquisaBinaria pesquisa = new MetodoPesquisaBinaria(vetorDados);
        
        int busca = pesquisa.buscaBinariaRenda(elementoBuscado);
        
        if (busca != -1){
            System.out.println("A Renda: "+ vetorDados.getValorByID(busca).getRenda()+" foi encontrada na "+(busca+1)+"ª posição!");
        }
        else{
            System.out.println("Elemento não encontrado!");
        }
    }
    
    public void removerDados(){
        /*--Inicio da Explicação-- da função(não), digo método, removerDados
            Para remover um item, 
            1-Encontra-se ele de forma sequencial. Se encontrado: 2
            2-Coloca na posição atual o ponteiro(NãO), digo referência do próximo elemento (que está depois do atual).
            Fazendo isso até uma posição antes do final. 
            Observação: 
                Na última posição vai ficar um elemento lixo , 
                e quando for inserido um novo elemento naquele índice,
                irá perder-se o ponteiro(NãO), digo a referencia que aponta para o elemento com lixo.
                e será criado um novo elemento e será guradada nessa posição o ponteiro(NãO), digo referência desse novo elemento.
                    E ainda, aquele elemento que perdeu-se o ponteiro(NãO), digo a referência, 
                    sera excluido da memória RAM depois de algum tempo, 
                    pelo limpador de memória(Garbage Collection) da Java Virtual Machine,
                    Sendo que este verifica objetos sem utilidade periodicamente e os remove da memória
        --Fim da Explicação--*/
        System.out.println("Digite o elemento a ser removido através da idade: ");
        int elementoBuscado = entradaTeclado.nextInt();
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
            System.out.println("O elemento foi encontrado e removido!");
        }else{
            System.out.println("O elemento não foi encontrado e não pode ser removido!");
        }
    }
    
    public int verificaSeExistemDados(){
        /*função só returna numero de elemento inseridos.
        Neste caso só pra organizar melhor, porque poderia também chamar:
        variavel = vetorDados.getNumElementosInseridos();*/
        return vetorDados.getNumElementosInseridos();
    }
}
