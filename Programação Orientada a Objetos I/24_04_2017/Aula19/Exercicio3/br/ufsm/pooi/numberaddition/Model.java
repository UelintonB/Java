/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.pooi.numberaddition;

/**
 *
 * @author Patrick Guerra
 */
public class Model {
    public String calc(String sA, String sB){
        Double a = Double.parseDouble(sA);
        Double b = Double.parseDouble(sB);
        Double c = a + b;
        return String.valueOf(c);
    }

}
