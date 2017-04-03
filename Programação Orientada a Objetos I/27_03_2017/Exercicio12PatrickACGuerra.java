/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio12patrickacguerra;

import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class Exercicio12PatrickACGuerra {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        endereco_Aluno[] alunos;
        int qtd_aluno;
        int i;
        int tipo;
        String endereco;
        String bairro;
        String uf;
        String cep;
        String telefone;
        String telefone_contato;
        String e_mail;
        
        System.out.print("Digite a quantidade de alunos:");
        qtd_aluno=entrada.nextInt();
        alunos = new endereco_Aluno[qtd_aluno];
        
        for(i=0; i < qtd_aluno; i++){
            System.out.printf("Aluno %d:\n",i+1);
            System.out.printf("Digite o tipo 1-Casa 2-Apartamento: ");
            tipo = entrada.nextInt();
            entrada.nextLine();
            System.out.printf("Digite o endereço: ");
            endereco = entrada.nextLine();
            System.out.printf("Digite o bairro: ");
            bairro = entrada.nextLine();
            System.out.printf("Digite o UF: ");
            uf = entrada.nextLine();
            System.out.printf("Digite o CEP: ");
            cep = entrada.nextLine();
            System.out.printf("Digite o telefone: ");
            telefone = entrada.nextLine();
            System.out.printf("Digite o telefone de contato: ");
            telefone_contato = entrada.nextLine();
            System.out.printf("Digite o email: ");
            e_mail = entrada.nextLine();
            alunos[i] = new endereco_Aluno(tipo, endereco, bairro, uf, cep, telefone, telefone_contato, e_mail);
            System.out.println("---------------------------------------------------");
        }
        
        System.out.println("Dados Cadastrados:");
        System.out.println("---------------------------------------------------");
        for(i=0; i < qtd_aluno; i++){
            System.out.printf("Aluno %d:\n", i + 1);
            System.out.printf("Tipo: %s\n", alunos[i].converte_tipo(alunos[i].getTipo()));
            System.out.printf("Endereço: %s\n", alunos[i].getEndereco());
            System.out.printf("Bairro: %s\n", alunos[i].getBairro());
            System.out.printf("UF: %s\n", alunos[i].getUf());
            System.out.printf("CEP: %s\n", alunos[i].getCep());
            System.out.printf("Telefone: %s\n", alunos[i].getTelefone());
            System.out.printf("Telefone de Contato: %s\n", alunos[i].getTelefone_contato());
            System.out.printf("Email: %s\n",alunos[i].getE_mail());
            System.out.println("---------------------------------------------------");
        }
    }
}