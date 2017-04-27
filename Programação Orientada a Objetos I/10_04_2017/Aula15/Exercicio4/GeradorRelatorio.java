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
public class GeradorRelatorio {
    public void adiciona(EmpregadoDaFaculdade f) {
        System.out.println(f.getInfo());
        System.out.println("Gastos: "+f.getGastos());
    }
}
