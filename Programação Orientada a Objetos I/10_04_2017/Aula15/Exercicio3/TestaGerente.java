/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula15_exe3_caelum_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class TestaGerente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        LeituraTeclado input = new LeituraTeclado();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        funcionario1.setCpf("651.664.248.57");
        funcionario1.setNome("Maria");
        funcionario1.setSenha(12345);
        controle.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000.0);
        funcionario2.setCpf("458.606.528.46");
        funcionario2.setNome("Joao");
        controle.registra(funcionario2);
        funcionario1.setNDeFuncGerenciados(1);

        System.out.println("Total de Bonificacoes: " + controle.getTotalDeBonificacoes());
        System.out.println("Funcionarios Cadastrados:");
        System.out.println("->Gerente: ");
        if( funcionario1.autentica( Integer.parseInt( input.getEntrada("Para exibir dados do gerente Digite 12345 senha:") ) ) ){
            System.out.println();
            System.out.println("Nome: "+funcionario1.getNome());
            System.out.println("CPF: "+funcionario1.getCpf());
            System.out.println("Salario: "+funcionario1.getSalario());
            System.out.println("Bonificacao: "+funcionario1.getBonificacao());
            System.out.println("Funcionarios gerenciados: "+funcionario1.getnDeFuncGerenciados());
        }
        System.out.println();
        System.out.println("->Funcionario: ");
        System.out.println("Nome: "+funcionario2.getNome());
        System.out.println("CPF: "+funcionario2.getCpf());
        System.out.println("Salario: "+funcionario2.getSalario());
        System.out.println("Bonificacao: "+funcionario2.getBonificacao());
            
    }

}
