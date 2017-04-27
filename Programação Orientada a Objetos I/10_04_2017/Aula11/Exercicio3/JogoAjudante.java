/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11_exe3_patrickacguerra;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class JogoAjudante {
    public String getEntradaJogador(String linha){
        Scanner leituraTeclado = new Scanner(System.in);
        String linhaEntrada = null;
        
        System.out.print(linha+" ");
        linhaEntrada = leituraTeclado.nextLine();
        if(linhaEntrada.length() == 0)
            return null;
        return linhaEntrada;
    }
}
