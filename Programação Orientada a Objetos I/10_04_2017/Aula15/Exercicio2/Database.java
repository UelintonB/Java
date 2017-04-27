/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula15_exe2_patrickacguerra;

import java.util.ArrayList;

/**
 *
 * @author Patrick Guerra
 */
public class Database {
    private ArrayList<Item> itens = new ArrayList<>();

    public void addItem(Item item){
        itens.add(item);
    }
    
    public void list(){
        for(Item item : itens){
            item.print();
            System.out.println();
        }
    }
    
    public Item pesqPorItem(String tmpTitulo){
        for(Item item : itens){
            if(item.getTitle().equalsIgnoreCase(tmpTitulo)){
                return item;
            }
        }
        return null;
    }
}
