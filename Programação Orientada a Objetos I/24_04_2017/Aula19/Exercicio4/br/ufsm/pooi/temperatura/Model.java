/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.pooi.temperatura;

/**
 *
 * @author Patrick Guerra
 */
public class Model {
    public String converterFToC(String sF){
       Double c = Double.parseDouble(sF);
       c =(c - 32)/1.8;
       return String.valueOf(c); 
    }
    
    public String converterCToF(String sC){
        Double c = Double.parseDouble(sC);
        c = (c * 1.8) + 32;
        return String.valueOf(c);
    }

}
