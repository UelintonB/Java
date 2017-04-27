/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula15_exe4faculdade_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class ControleFolhaPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LeituraTeclado input = new LeituraTeclado();
        EmpregadoDaFaculdade empre1 = new EmpregadoDaFaculdade();
        
        System.out.println("Cadastro de empregado da Universidade:");
        empre1.setNome(input.getEntrada("Digite o nome:"));
        empre1.setSalario(Double.parseDouble(input.getEntrada("Digite o salario:") ));
        
        System.out.println("Cadastro de Professor:");
        ProfessorDaFaculdade prof1 = new ProfessorDaFaculdade();
        prof1.setNome(input.getEntrada("Digite o nome:"));
        prof1.setSalario(Double.parseDouble( input.getEntrada("DIgite o salario:") ));
        prof1.setHorasDeAula(Integer.parseInt( input.getEntrada("Digite a quantidade de horas de aula:")));
        
        System.out.println("Cadastro de Reitor:");
        Reitor reitor = new Reitor();
        reitor.setNome(input.getEntrada("Digite o nome:"));
        reitor.setSalario(Double.parseDouble( input.getEntrada("DIgite o salario:") ));
        
        System.out.println("Empregados Cadastrados:");
        GeradorRelatorio relatorio = new GeradorRelatorio();
        relatorio.adiciona(empre1);
        relatorio.adiciona(prof1);
        relatorio.adiciona(reitor);
    }

}
