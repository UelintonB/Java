/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cantina04patrickacguerra;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class Cantina04PatrickACGuerra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pastel_de_carne = 200;
        int cachorro_quente = 200;
        int coxinha = 200;
        int continuar = 1;
        Scanner entrada = new Scanner(System.in);
        while(continuar == 1){
            
            System.out.print("Deseja comprar quantos pasteis de carne:");
            int tmp_pasteis_de_carne = entrada.nextInt();
            tmp_pasteis_de_carne = pastel_de_carne - tmp_pasteis_de_carne;
            while(tmp_pasteis_de_carne < 0){
                System.out.println("Nao ha unidades suficientes desse produto");
                System.out.print("Deseja comprar quantos pasteis de carne:");
                tmp_pasteis_de_carne = entrada.nextInt();
                tmp_pasteis_de_carne = pastel_de_carne - tmp_pasteis_de_carne;
            }
            System.out.print("Deseja comprar quantos cachorro quente:");
            int tmp_cachorro_quente = entrada.nextInt();
            tmp_cachorro_quente = cachorro_quente - tmp_cachorro_quente;
            while (tmp_cachorro_quente < 0) {                
                System.out.println("Nao ha unidades suficientes desse produto");
                System.out.print("Deseja comprar quantos cachorro quente:");
                tmp_cachorro_quente = entrada.nextInt();
                tmp_cachorro_quente = cachorro_quente - tmp_cachorro_quente;
            }
            System.out.print("Deseja comprar quantas coxinhas:");
            int tmp_coxinhas = entrada.nextInt();
            tmp_coxinhas = coxinha - tmp_coxinhas;
            while(tmp_coxinhas < 0){
                System.out.println("Nao ha unidades suficientes desse produto");
                System.out.print("Deseja comprar quantas coxinhas:");
                tmp_coxinhas = entrada.nextInt();
                tmp_coxinhas = coxinha - tmp_coxinhas;
            }
            pastel_de_carne = tmp_pasteis_de_carne;
            cachorro_quente = tmp_cachorro_quente;
            coxinha = tmp_coxinhas;
            if(pastel_de_carne == 0 || cachorro_quente == 0 || coxinha == 0)
                break;
            System.out.print("Registrar nova compra? 1-Sim 2-Fechar caixa\nDigite a sua opcao: ");
            continuar = entrada.nextInt();
        }
        System.out.println("Balanco:");
        int pasteisVend = 200-pastel_de_carne;
        int cqVend = 200-cachorro_quente;
        int coxVend = 200-coxinha;
        int totalVend = pasteisVend + cqVend + coxVend;
        System.out.println("|----------------|---------|-----------");
        System.out.printf("|Produto         |Total:%3d|Porcentagem\n",totalVend);
        System.out.println("|----------------|---------|-----------");
        double porc_pv = (double) pasteisVend/totalVend *100;
        double porc_cq = (double) cqVend/totalVend * 100;
        double porc_co = (double) coxVend/totalVend * 100;
        char porcentagem = '%';
        System.out.printf("|Pastel de Carne |%9d|%.2f%c\n",pasteisVend,porc_pv,porcentagem);
        System.out.printf("|Cachorro Quente |%9d|%.2f%c\n",cqVend,porc_cq,porcentagem);
        System.out.printf("|Coxinha         |%9d|%.2f%c\n",coxVend,porc_co,porcentagem);
        System.out.println("|----------------|---------|-----------");
        int i, j;
        int vetor[]={pasteisVend,cqVend,coxVend};
        String vetor2[]={"Pastel de Carne", "Cachorro Quente", "Coxinha"};
        for(i=1;i<3;i++){
            int temp = vetor[i];
            String temp2 = vetor2[i];
            j = i;
            while(j>0 && vetor[j-1] < temp){
                vetor[j] = vetor[j - 1];
                vetor2[j] = vetor2[j - 1];
                --j;
            }
            vetor[j] = temp;
            vetor2[j] = temp2;
        }
        if(vetor[0] == vetor[1] && vetor[0] == vetor[2]){
            System.out.println("Os 3 Produtos tiveram mesma saida, porcentagem de venda de cada produto: 33,33%");
        }else{
            if(vetor[0] == vetor[1]){
                System.out.printf("Os Produtos: %s e %s tiveram mesma saida, porcentagem de venda de cada produto: %.2f%c\n",vetor2[0],vetor2[1],(double)vetor[0]/totalVend*100,porcentagem);
            }else{
                if(vetor[1] == vetor[2]){
                    System.out.printf("Os Produtos: %s e %s tiveram mesma saida, "
                            + "porcentagem de venda de cada produto: %.2f%c\n",vetor2[1],vetor2[2],(double)vetor[0]/totalVend*100,porcentagem);
                }else{
                    if(vetor[0] > vetor[1] && vetor[0] > vetor[2]){
                        System.out.printf("O produto mais consumido foi: %s, Porcentagem: %.2f%c\n",vetor2[0],(double)vetor[0]/totalVend*100,porcentagem);
                    }
                }
            }
        }
    }
}
