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
public class Gerente extends Funcionario{
    private int senha;
    private int nDeFuncGerenciados = 0;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000;
    }

    public void setNDeFuncGerenciados(int nDeFuncGerenciados) {
        this.nDeFuncGerenciados = nDeFuncGerenciados;
    }

    public int getnDeFuncGerenciados() {
        return nDeFuncGerenciados;
    }
}
