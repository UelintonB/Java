/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio03patrickacguerra;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class Exercicio03PatrickACGuerra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int continua=1;
        double valorImovel;
        double parcelaFixa;
        double parcelaVariavel;
        Scanner ler = new Scanner(System.in);
        
        while(continua == 1){
            System.out.print("Digite o valor do imóvel: ");
            valorImovel=ler.nextDouble();
            if(valorImovel < 100000){
                parcelaFixa=1000;
                parcelaVariavel=valorImovel*0.06;
                System.out.printf("O valor gasto com a carretagem é: R$%.2f",parcelaFixa+parcelaVariavel);                
            }else if(valorImovel < 200000){
                parcelaFixa=2000;
                parcelaVariavel=valorImovel*0.05;
                System.out.printf("O valor gasto com a corretagem é: R$%.2f",parcelaFixa+parcelaVariavel);
            }else if (valorImovel < 500000){
                parcelaFixa=3000; 
                parcelaVariavel=valorImovel*0.04;
                System.out.printf("O valor gasto com a corretagem é : RS%.2f",parcelaFixa+parcelaVariavel);
            }else if (valorImovel <  1000000){ 
                parcelaFixa=4000; 
                parcelaVariavel=valorImovel*0.03;
                System.out.printf("O valor gasto com a corretagem é : RS%.2f",parcelaFixa+parcelaVariavel);
            }else{
                parcelaFixa=5000; 
                parcelaVariavel=valorImovel*0.02;
                System .out.printf ("O valor gasto com a corretagem é : RS% .2f",parcelaFixa+parcelaVariavel);
                }
                System .out.printf("\n\nDeseja calcular o valor da corretagem p/ outro imóvel?"
                        + "\n 1-sim\n 2-não \n Digite a sua opção :");
                continua=ler.nextInt();
        }
    }

}
