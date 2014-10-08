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
    private int hp = 0;
    private int speed;
    private int initiative;
    private int fort;
    private int reflex;
    private int will;
    private int bab;
    private int cmb;
    private int cmd;
    private int strMod;
    private int dexMod;
    private int conMod;
    private int intMod;
    private int wisMod;
    private int chaMod;
    
    
    public void setMods(){
        strMod=(strength-10)/2;
        dexMod=(dexterity-10)/2;
        conMod=(constitution-10)/2;
        intMod=(intelligence-10)/2;
        wisMod=(wisdom-10)/2;
        chaMod=(charisma-10)/2;
    }
    
    public int getStrMod(){
        return strMod;
    }
    public int getDexMod(){
        return dexMod;
    }
    public int getConMod(){
        return conMod;
    }
    public int getIntMod(){
        return intMod;
    }
    public int getWisMod(){
        return wisMod;
    }
    public int getChaMod(){
        return chaMod;
    }
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
    public void setCmd(int c){
        cmd = c;
    }
    public int getCmd(){
        return cmd;
    }
    public void setCmb(int c){
        cmb = c;
    }
    public int getCmb(){
        return cmb;
    }
    public void setBab(int b){
        bab = b;
    }
    public int getBab(){
        return bab;
    }
    public void setWill(int w){
        will = w;
    }
    public int getWill(){
        return will;
    }
    public void setReflex(int r){
        reflex = r;
    }
    public int getReflex(){
        return reflex;
    }
    public void setFort(int f){
        fort = f;
    }
    public int getFort(){
        return fort;
    }
    public void setInit(int i){
        initiative = i;
    }
    public int getInit(){
        return initiative;
    }
    public void setSpeed(int s){
        speed = s;
    }
    public int getSpeed(){
        return speed;
    }
    public void setHp(int h){
        hp = h;
    }
    public int getHp(){
        return hp;
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
