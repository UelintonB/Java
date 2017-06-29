/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulapersistenciaarquivosequencial;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author Patrick Guerra
 */
public class Funcionario {
    private int codFuncionario;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private double salario;

    public Funcionario(int codFuncionario, String nome, String cpf, String dataNascimento, double salario) {
        this.codFuncionario = codFuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    
    public void salva(DataOutputStream out) throws IOException{
        out.writeInt(codFuncionario);
        out.writeUTF(nome);
        out.writeUTF(cpf);
        out.writeUTF(dataNascimento);
        out.writeDouble(salario);
        System.out.println("Gravacao do funcionario de codigo " + codFuncionario + " realizada com sucesso");
    }
    
    public void le(DataInputStream in) throws IOException{
        codFuncionario = in.readInt();
        nome = in.readUTF();
        cpf = in.readUTF();
        dataNascimento = in.readUTF();
        salario = in.readDouble();
    }
    
    public void imprime(){
        System.out.println("--------------------------------");
        System.out.println("Codigo: "+codFuncionario);
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Data de Nascimento: "+dataNascimento);
        System.out.println("Salario: "+salario);
    }
}
