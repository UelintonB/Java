/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shell;

/**
 *
 * @author Patrick Guerra
 */
public class DadosShell {
    private int numero_da_conta;
    private double saldo;
    private double limite;
    private String nome;

    public DadosShell(int numero_da_conta, double saldo, double limite, String nome) {
        this.numero_da_conta = numero_da_conta;
        this.saldo = saldo;
        this.limite = limite;
        this.nome = nome;
    }

    public int getNumero_da_conta() {
        return numero_da_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public String getNome() {
        return nome;
    }
    
}
