/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dndcharactersheethelper;

/**
 *
 * @author software
 */
import java.util.Random;
public class Fighter {
    
    public static void update(Player o){
        Random rand = new Random();
        int lvl = o.getLvl();
        o.setHp(o.getHp()+o.getConMod()+1+rand.nextInt(10));
        o.setBab(lvl);
        o.setFort((lvl/2)+2);
        o.setReflex(lvl/3);
        o.setWill(lvl/3);       
    }
}
