/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arvorebinariadebuscapatrick2;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class InterfaceArvore {
    Scanner entradaTeclado = new Scanner(System.in);

    ArvoreBinariaBusca2 arvorebinariabusca = new ArvoreBinariaBusca2();
        
    public void executar(){
        
        //Inserção de 5 elementos na arvore
        arvorebinariabusca.insercao(6);
        arvorebinariabusca.insercao(4);
        arvorebinariabusca.insercao(10);
        arvorebinariabusca.insercao(2);
        arvorebinariabusca.insercao(5);
        
        System.out.print("Insercao de novo elemento na arvore binaria de busca ");
        System.out.println("\nDigite o elemento a ser inserido");
        arvorebinariabusca.insercao(entradaTeclado.nextInt());
        System.out.print("----------------------------------------\n");
        
        System.out.print("Busca por um elelmento na arvore binaria de busca");
        System.out.println("\nDigite o elemento a ser buscado");
        No encontrouNo = arvorebinariabusca.busca(entradaTeclado.nextInt());
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
