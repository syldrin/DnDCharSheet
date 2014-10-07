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
public class Creature {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    
    public void setStr(int str){
        strength = str;
    }
    public void setDex(int dex){
        dexterity = dex;
    }
    public void setCon(int con){
        constitution = con;
    }
    public void setInt(int intel){
        intelligence = intel;
    }
    public void setWis(int wis){
        wisdom = wis;
    }
    public void setCha(int cha){
        charisma = cha;
    }
    public int getStr(){
        return strength;
    }
    public int getDex(){
        return dexterity;
    }
    public int getCon(){
        return constitution;
    }
    public int getInt(){
        return intelligence;
    }
    public int getWis(){
        return wisdom;
    }
    public int getCha(){
        return charisma;
    }
    
}
