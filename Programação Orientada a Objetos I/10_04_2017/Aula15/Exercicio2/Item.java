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
public class Item {
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public void setItem(String theTitle, int time) {
        this.title = theTitle;
        this.playingTime = time;
        this.gotIt = false;
        this.comment = " ";
    }
    
    public boolean getOwn() {
        return gotIt;
    }

    public void setOwn(boolean ownIt) {
        this.gotIt = ownIt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }
    
    public void print(){
        System.out.println("Titulo: "+title);
        System.out.println("Time: "+playingTime);
        System.out.println("gotIt: "+gotIt);
        System.out.println("Comentario: "+comment);
    }
    
}
