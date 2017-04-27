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
public class DVD {
    private String title;
    private String director;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    
    public void setDVD(String theTitle, String theDirector, int time){
        title = theTitle;
        director = theDirector;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public boolean getOwn() {
        return gotIt;
    }

    public void setOwn(boolean gotIt) {
        this.gotIt = gotIt;
    }
    
    public void print(){
        System.out.printf("DVD: %s (%d mins)",title,playingTime);
        if(gotIt)
            System.out.print("*");
        System.out.printf("\n\t%s\n\t%s\n",director,comment);
    }
}
