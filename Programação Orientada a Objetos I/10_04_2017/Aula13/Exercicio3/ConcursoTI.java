/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula13_exe3_PatrickACGuerra;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Patrick Guerra
 */
public class ConcursoTI {
    private ArrayList<Candidato> candidatos = new ArrayList<>();
    
    public void cadastroCandidatos(){
        candidatos.add(new Candidato("Lula Silva", "Frederico Westphalen", "RS", (float)80.0, 33));
        candidatos.add(new Candidato("Maria Ferreira", "Uberlandia", "MG", (float)81.0, 34));
        candidatos.add(new Candidato("Jose Oliveira", "Porto Velho", "RO", (float)81.0, 33));
    }
    
    public void cadastroCandidatos(String nome, String cidade, String estado, float notaProva, int idade){
        candidatos.add(new Candidato(nome, cidade, estado, notaProva, idade));
    }
    
    public void relatorioCandidatos(){
        System.out.printf("\nCandidatos Cadastrados:\n");
        candidatos.forEach((candidatoAtual) -> {
            System.out.printf("->Nome: %s\n Cidade: %s\n Estado: %s\n Nota da Prova: %.2f\n Idade: %d\n\n", 
                    candidatoAtual.getNome(), candidatoAtual.getCidade(), candidatoAtual.getEstado(),
                    candidatoAtual.getNotaProva(), candidatoAtual.getIdade());
        });
    }
    
    public void candidatosAprovados(){
        System.out.printf("\nCandidatos Aprovados:\n");
        candidatos.forEach((atual) -> {
            if(atual.getNotaProva() == candidatos.get(0).getNotaProva()){
                System.out.printf("->Nome: %s\n Cidade: %s\n Estado: %s\n Nota da Prova: %.2f\n Idade: %d\n\n", 
                    atual.getNome(), atual.getCidade(), atual.getEstado(), atual.getNotaProva(), atual.getIdade());
            }
        });
    }
    
    private void ordenaPorNota() {
        Collections.sort(candidatos, (Candidato o1, Candidato o2) -> {
            if (o1.getNotaProva() < o1.getNotaProva()) return 1;
            if (o1.getNotaProva() > o2.getNotaProva()) return -1;
            return 0;
        });
    }
    
    public static void main(String[] args) {
        ConcursoTI concursoAtual = new ConcursoTI();
        LeituraTeclado input = new LeituraTeclado();
        int opcao = -1;
        
        concursoAtual.cadastroCandidatos();
        while(opcao != 0){
            System.out.printf("\nConcurso TI - Patrick A. C. Guerra\n-> Opcoes:\n\t1- Cadastrar\n");
            System.out.printf("\t2- Listar Candidatos\n\t3- Listar Aprovados\n\t0- Sair\n-> Digite uma opcao: ");
            switch(opcao = Integer.parseInt(input.getEntrada("")) ){
                case 1:
                    System.out.printf("Cadastro de Candidato:\nDigite:\n");
                    concursoAtual.cadastroCandidatos(
                        input.getEntrada("-> Nome:"),
                        input.getEntrada("-> Cidade:"),
                        input.getEntrada("-> Estado:"),
                        Float.parseFloat(input.getEntrada("-> Nota da Prova:")),
                        Integer.parseInt(input.getEntrada("-> Idade:"))
                    ); 
                    System.out.println("Candidato Cadastrado!"); break;
                case 2:
                    concursoAtual.relatorioCandidatos(); break;
                case 3:
                    concursoAtual.ordenaPorNota();
                    concursoAtual.candidatosAprovados(); break;
                default:
                    break;
            }
        }
    }
}
