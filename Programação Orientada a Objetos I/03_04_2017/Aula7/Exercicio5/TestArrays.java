/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula7_exe5_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class TestArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] islands = new String[4];
        int [] index = new int[4];
        int y = 0;
        
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        
        int ref;
        while(y < 4){
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y++;
        }
    }

}
