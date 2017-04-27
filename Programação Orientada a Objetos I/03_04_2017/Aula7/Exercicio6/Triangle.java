/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula7_exe6_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    double area;
    int height;
    int length;
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle [] ta = new Triangle[4];
        int x = 0;
        while(x < 4){
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle "+x+", area");
            System.out.println(" = " + ta[x].area);
            x++;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }
    void setArea(){
        area = (height * length) / 2;
    }

}
