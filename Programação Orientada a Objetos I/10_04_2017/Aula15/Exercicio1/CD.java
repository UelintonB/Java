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
public class CD {
    private String title;
    private String artist;
    private int numberOfTracks;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public void setCD(String theTitle, String theArtist, int tracks, int time) {
        title = theTitle;
        artist = theArtist;
        numberOfTracks = tracks;
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

    public void setOwn(boolean OwnIt) {
        this.gotIt = OwnIt;
    }
    
    public void print(){
        System.out.printf("CD: %s (%d mins)",title,playingTime);
        if(gotIt)
            System.out.print("*");
        System.out.printf("\n\t%s\n\tFaixas: %d\n\t%s\n",artist,numberOfTracks,comment);
    }
}
