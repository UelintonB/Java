/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArvoreBusca;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class PrincipalArvoreBinariaBusca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int value;
        Scanner entradaTeclado = new Scanner(System.in);
        
        ArvoreBinariaBusca arvoreBinariaBusca = new ArvoreBinariaBusca();
        
        //Inserção de 5 elementos na arvore
        arvoreBinariaBusca.insercao(6);
        arvoreBinariaBusca.insercao(4);
        arvoreBinariaBusca.insercao(10);
        arvoreBinariaBusca.insercao(2);
        arvoreBinariaBusca.insercao(5);
        
        System.out.print("Insercao de novo elemento na arvore binaria de busca ");
        System.out.println("\nDigite o elemento a ser inserido");
        arvoreBinariaBusca.insercao(entradaTeclado.nextInt());
        System.out.print("----------------------------------------\n");
        
        System.out.print("Busca por um elelmento na arvore binaria de busca");
        System.out.println("\nDigite o elemento a ser buscado");
        No encontrouNo = arvoreBinariaBusca.busca(entradaTeclado.nextInt());
        if(encontrouNo != null){
            System.out.print("Foi encontrado o No na arvore: ");
            encontrouNo.imprimeNo();
            System.out.println();
        }else{
            System.out.print("Nao encontrou o No");
        }
        System.out.print("----------------------------------------------\n");
    }

}
