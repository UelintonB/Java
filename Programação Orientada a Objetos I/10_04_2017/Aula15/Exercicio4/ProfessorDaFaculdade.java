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
public class ProfessorDaFaculdade extends EmpregadoDaFaculdade{
    private int horasDeAula;
    
    public void setHorasDeAula(int horasDeAula) {
        this.horasDeAula = horasDeAula;
    }
    
    @Override
    double getGastos() {
        return this.getSalario() + this.horasDeAula * 10;
    }
    
    @Override
    String getInfo() {
        String informacaoBasica = super.getInfo();
        String informacao = informacaoBasica + " horas de aula: " 
                          + this.horasDeAula;
        return informacao;
    }
}