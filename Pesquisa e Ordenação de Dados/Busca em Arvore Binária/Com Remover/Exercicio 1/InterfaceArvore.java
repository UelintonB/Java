/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg01arvorebinariadebuscaremoverpatrick;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class InterfaceArvore {
    
    ArvoreBinariaBusca arvorebinaria = new ArvoreBinariaBusca();
    Scanner entradaTeclado = new Scanner(System.in);
    
    public void executar(){
        
        int i=-1;
        while(i!=0){
            System.out.println("\n------**3-Arvore Binaria Busca**--------");
            System.out.println("Nome: Patrick Andrei Caron Guerra");
            System.out.println("----------------------------------------");
            System.out.println("1 - Inserir dados");
            System.out.println("2 - Busca");
            System.out.println("3 - Imprimir Arvore em Ordem");
            System.out.println("4 - Remover");
            System.out.println("----------------------------------------");
            System.out.println("0 - Sair do Programa");
            System.out.print("Digite a Opcao: ");
            i = entradaTeclado.nextInt();
            switch(i){
                case 1:
                    inserir();
                    break;
                case 2:
                    pesquisar();
                    break;
                case 3:
                    imprimirEmOrdem();
                    break;
                case 4:
                    remover();
                    break;
                default:
                    break;
            }
        }
    }
    
    public void inserir(){
        System.out.println("\n-->Inserir Elemento Na Arvore Binaria");
        System.out.print("Digite a informacao: ");
        int info = entradaTeclado.nextInt(); 
        arvorebinaria.insercao(info);
    }
    
    public void pesquisar(){
        System.out.println("\n-->Buscar Elemento Na Arvore Binaria");
        System.out.print("Digite a informacao a ser buscada: ");
        int elementoBuscado = entradaTeclado.nextInt(); 
        No encontrouNo = arvorebinaria.busca(elementoBuscado);
        if(encontrouNo != null){
            System.out.println("A informacao:" +elementoBuscado+ " foi encontrada na arvore");
            encontrouNo.imprimeNo();
        }else{
            System.out.println("Idade nao encontrada!");
        }
    }
    
    public void imprimirEmOrdem(){
        System.out.println("\n-->Imprimir Em Ordem a Arvore Binaria");
        arvorebinaria.imprimirArvoreEmOrdem();
    }
    
    public void remover(){
        System.out.println("\n-->Remover Elemento Na Arvore Binaria");
        System.out.print("Digite a informacao: ");
        int info = entradaTeclado.nextInt(); 
        arvorebinaria.remover(info);
    }

}
