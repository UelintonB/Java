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
public class PrincipalBuscaSequencial {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner (System.in);
        System.out.print("Qual é o numero total de elementos a serem inseridos? ");
        int numMaxElementos = entradaTeclado.nextInt();
        MenuBuscaSequencial programa = new MenuBuscaSequencial(numMaxElementos);
        programa.execute ();
    }

}
