/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula9_exe5_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class Mix4 {

    /**
     * @param args the command line arguments
     */
    int counter = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        Mix4 [] m4a = new Mix4[20];
        int x = 0;
        
        while(x < 9){
            
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count++;
            count = count + m4a[x].maybeNew(x);
            x++;
        }
        System.out.println(count + " " + m4a[1].counter);
    }
    
    public int maybeNew(int index){

        if(index < 5){

            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
