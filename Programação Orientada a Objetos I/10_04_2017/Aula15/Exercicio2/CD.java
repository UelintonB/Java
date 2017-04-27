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
public class CD extends Item{
    private String artist;
    private int numberOfTracks;

    public void setCD(String theTitle, String theArtist,int tracks, int time) {
        super.setItem(theTitle, time);
        this.artist = theArtist;
        this.numberOfTracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }
    
    @Override
    public void print(){
        System.out.println("->CD");
        super.print();
        System.out.println("Artista: "+artist);
        System.out.println("Numero de Faixas: "+numberOfTracks);
    }
}
