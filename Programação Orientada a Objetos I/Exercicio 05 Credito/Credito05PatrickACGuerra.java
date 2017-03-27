/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package credito05patrickacguerra;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class Credito05PatrickACGuerra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Linha de crédito prefeitura ...");
        double salario;
        double totalEmprest;
        int prazo;
        double parcela;
        while(true){
            System.out.print("Digite o salário: ");
            salario = entrada.nextDouble();
            System.out.println("Digite o valor total do empréstimo: ");
            totalEmprest = entrada.nextDouble();
            System.out.println("DIgite o prazo de pagamento em meses: ");
            prazo = entrada.nextInt();
            parcela = (double) totalEmprest/prazo;
            if(prazo > 12){
                System.out.println("O prazo maximo é 12 meses!");
            }else{
                if(parcela > salario * 0.3){
                    System.out.println("Parcela nao pode ultrapassar 30% do salario bruto");
                }else{
                    System.out.printf("Valor Total do emprestimo: R$%.2f\n",totalEmprest);
                    System.out.printf("Valor da prestação: R$%.2f\n", parcela);
                    System.out.printf("Quntidade de parcelas: %dx\n", prazo);
                    break;
                }
            }
        }
    }

}
