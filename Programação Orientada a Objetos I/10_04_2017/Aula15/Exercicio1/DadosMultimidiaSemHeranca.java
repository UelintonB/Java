/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula15_exe1_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class DadosMultimidiaSemHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Database base = new Database();
        
        CD cd1 = new CD();
        cd1.setCD("Prism","Katy Perry", 13, 48);
        cd1.setComment("Good");
        base.addCD(cd1);
        
        CD cd2 = new CD();
        cd2.setCD("V", "Maroon 5", 11, 40);
        cd2.setComment("Good");
        base.addCD(cd2);
        
        DVD dvd1 = new DVD();
        dvd1.setDVD("Need for Speed", "Scott Waugh", 130);
        dvd1.setComment("Good");
        base.addDVD(dvd1);
        
        DVD dvd2 = new DVD();
        dvd2.setDVD("Harry Potter e a Camara Secreta", "Chris Columbus", 161);
        dvd2.setComment("Good");
        base.addDVD(dvd2);
        
        base.list();
    }

}
