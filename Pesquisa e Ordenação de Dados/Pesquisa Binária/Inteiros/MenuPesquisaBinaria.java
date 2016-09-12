/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pesquisabinaria2016inteiros;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class MenuPesquisaBinaria {
    DadosPesquisaBinaria vetorDados;
    Scanner entradaTeclado = new Scanner (System.in);
    MetodoOrdenacaoShellSort ordenacao;
    int numMaxElementos;
    int existemElementos;
    
    public void execute (){
        System.out.print("Qual é o numero total de elementos a serem inseridos? ");
        numMaxElementos = entradaTeclado.nextInt();
        vetorDados = new DadosPesquisaBinaria(numMaxElementos); 
        int opcao = -1; 
        do{
            System.out.println();
            System.out.println("|--------**Patrick-Guerra**-----------|");
            System.out.println("|Pesquisa Binaria                     |");
            System.out.println("|-------------------------------------|");
            System.out.println("|1- Cadastrar Dados                   |");
            System.out.println("|2- Ordenar                           |");
            System.out.println("|3- Pesquisar                         |");
            System.out.println("|4- Imprimir Dados                    |");
            System.out.println("|5- Remover Elemento                  |");
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
                        ordenacao.ordenacaoShell();
                        System.out.println("\nDados Ordenados : ");
                        vetorDados.imprimirDados();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 3:
                    if(existemElementos>0){ //se numero de elementos cadastrados maior que zero
                        pesquisar();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 4:
                    if(existemElementos>0){ //se numero de elementos cadastrados maior que zero
                        System.out.println("\nDados Cadastrados: ");
                        vetorDados.imprimirDados();
                    }else{
                        System.out.println("\nErro: Não existem valores cadastrados!");
                    }
                    break;
                case 5:
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
                if(existemElementos>=numMaxElementos){
                    System.out.println("\nErro: Vetor Cheio!");
                    break;
                }else{
                    elementoatual=(existemElementos)+1; 
                    //elementoatual recebe posição atual +1, para exibir corretamente na tela, já que inicia em zero
                    System.out.print("\nDigite o "+elementoatual+"º elemento: ");
                    int numero = entradaTeclado.nextInt();
                    vetorDados.inserirDados(numero);
                    existemElementos++;
                    System.out.print("\nDeseja inserir novo elemento? (1-Sim 0-Não):");
                    op=entradaTeclado.nextInt();
                }
            }while(op!=0);    
    }
    
    public void pesquisar(){
        System.out.print("Digite o número a ser buscado: ");
        int elementoBuscado = entradaTeclado.nextInt(); 
        MetodoPesquisaBinaria pesquisa = new MetodoPesquisaBinaria(vetorDados);
        int []vetor;
        vetor = vetorDados.getVetorDados();
        
        int busca = pesquisa.buscaBinariaRenda(elementoBuscado);
        
        if (busca != -1){
            System.out.println("O número: "+vetor[busca]+" foi encontrada na "+(busca+1)+"ª posição!");
        }
        else{
            System.out.println("Elemento não encontrado!");
        }
    }
    
    public void removerDados(){
        int [] vetor = vetorDados.getVetorDados();
        System.out.println("Digite o elemento a ser removido: ");
        int elementoBuscado = entradaTeclado.nextInt();
        int i,c=-1;
        for(i=0;i<vetorDados.getNumElementosInseridos();i++){
            if(vetor[i]==elementoBuscado){
                c=i;
                while(c<(vetorDados.getNumElementosInseridos()-1)){
                    vetor[c]=vetor[c+1];
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
        return vetorDados.getNumElementosInseridos();
    }

}
