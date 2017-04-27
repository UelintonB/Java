/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula9_exe3_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class Xcopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int orig = 42;
        Xcopy x = new Xcopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    
    int go(int arg){
        arg = arg * 2;
        return arg;
    }

}
