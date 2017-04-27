/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula9_exe6_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class Puzzle4b {
    int ivar;
    public int doStuff(int factor){
        if(ivar > 100){
            return ivar * factor;
        }else{
            return ivar * (5 - factor);
        }
    }
}
