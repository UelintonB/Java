/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula11_exe2_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class MaquinaDeVenderBilhetes {
    static private int precoBilhete; 
    static private int montanteVendido = 0;
    
    public static void main(String[] args) {
        LeitorTeclado le = new LeitorTeclado();
        int opcao = 0;
        
        precoBilhete = le.imprimeeLe("Digite o valor do bilhete: ");
        while(true){
            opcao = le.imprimeeLe("\nDigite a opcao escolhida:\n1-Comprar bilhetes(s)\n2-Exibir montante vendido\n0-Sair\n");
            if(opcao == 1)
                montanteVendido += le.imprimeeLe("Digite a quantidade de bilhetes que deseja comprar: ");
            else if(opcao == 2)
                System.out.printf("\nBilhetes vendidos: %d, valor total: R$ %d\n",montanteVendido,montanteVendido*precoBilhete);
            else
                break;
        }
    }
}
