/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11_exe2_patrickacguerra;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class LeitorTeclado {
    private Scanner entrada = new Scanner(System.in);
    
    public int imprimeeLe(String print){
        System.out.printf("%s",print);
        return entrada.nextInt();
    }
    
}
