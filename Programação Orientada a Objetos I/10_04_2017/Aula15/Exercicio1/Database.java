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
public class Database {
    private CD [] cds = new CD[2];
    int contCD = 0;
    private DVD [] dvds = new DVD[2];
    int contDVD = 0;
    
    public void addCD(CD cd){
        cds[contCD++] = cd;
    }
    
    public void addDVD(DVD dvd){
        dvds[contDVD++] = dvd;
    }
    
    public void list(){
        System.out.println("CDs cadastrados: ");
        for(CD atual : cds)
            atual.print();
        System.out.println("DVDs cadastrados: ");
        for(DVD atual : dvds)
            atual.print();
    }
}
