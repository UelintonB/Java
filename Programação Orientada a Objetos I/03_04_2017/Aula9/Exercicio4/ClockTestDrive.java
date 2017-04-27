/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula9_exe4_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class ClockTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clock c = new Clock();
        
        c.setTime("12345");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }

}
