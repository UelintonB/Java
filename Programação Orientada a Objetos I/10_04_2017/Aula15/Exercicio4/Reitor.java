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
public class Reitor extends EmpregadoDaFaculdade{
    @Override
    String getInfo() {
        return super.getInfo() + " e ele é um reitor";
    }
}
