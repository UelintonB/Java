/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula15_exe2_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class DVD extends Item{
    private String director;
    
    public void setDVD(String theTitle, String theDirector, int time){
        super.setItem(theTitle, time);
        this.director = theDirector;
    }

    public String getDirector() {
        return director;
    }
    
    @Override
    public void print(){
        System.out.println("->DVD");
        super.print();
        System.out.println("Diretor: "+director);
    }
}
