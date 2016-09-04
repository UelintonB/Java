/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shellPodNumero;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class PrincipalShellNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        MetodoShellNumeros vetorDados = new MetodoShellNumeros(10);
//        vetorDados.inserirDados(10);
//        vetorDados.inserirDados(9);
//        vetorDados.inserirDados(8);
//        vetorDados.inserirDados(7);
//        vetorDados.inserirDados(6);
//        vetorDados.inserirDados(5);
//        vetorDados.inserirDados(4);
//        vetorDados.inserirDados(3);
//        vetorDados.inserirDados(2);
//        vetorDados.inserirDados(1);
//        
//        System.out.println("Dados inseridos");
//        vetorDados.imprime();
//        
//        System.out.println("\n\nDados Ordenados");
//        vetorDados.ordenacaoShell();
//        vetorDados.imprime();
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.print("Qual o número de elementos inteiros a ser ordenados? ");
        int numMaxElementos = entradaTeclado.nextInt();
        MetodoShellNumeros vetorDados = new MetodoShellNumeros(numMaxElementos);
        
        for(int i=0;i<numMaxElementos;i++){
            System.out.print("Digite "+(i+1)+"º elemento:");
            int numero = entradaTeclado.nextInt();
            vetorDados.inserirDados(numero);
            System.out.println("--------------------");
        }
        System.out.println("Daddos inseridos");
        vetorDados.imprime();
        
        System.out.println("\n\nDados Ordenados");
        vetorDados.ordenacaoShell();
        vetorDados.imprime();
    }
    
}
