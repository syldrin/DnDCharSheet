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
public class Player extends Creature{
    Random rand = new Random();
    private int lvl;
    private int hitDie;
    private String race;
    private String job;
    private String[] races = {"Dwarf","Elf","Gnome","Half-Elf","Halfling","Half-Orc","Human"};
    private String[] jobs = {"Barbarian","Bard","Cleric","Druid","Fighter","Monk","Paladin","Ranger","Rogue","Sorcerer","Wizard"};
    
    
    public void setHitDie(int l){
        hitDie = l;
    }
    
    public int getHitDie(){
        return hitDie;    
    }
    
    public void setLvl(int l){
        lvl = l;
    }
    
    public int getLvl(){
        return lvl;    
    }
    
    public void setRace(int i){
        race = races[i];
    }
    
    public String getRace(){
        return race;
    }
    
    public String[] getRaces(){
        return races;
    }
    
    public void setJob(int i){
        job = jobs[i];
    }
    
    public String getJob(){
        return job;
    }
    
    public String[] getJobs(){
        return jobs;
    }
    
    public void setRacialTraits(int j){
        int k=0;
        for (int i=0;i<races.length;i++){
            if(race.equals(races[i])) k = i;
        }
        switch(k){
            case 0:
                super.setCon(super.getCon()+2);
                super.setWis(super.getWis()+2);
                super.setCha(super.getCha()-2);
                super.setSpeed(20);
                break;
            case 1:
                super.setDex(super.getDex()+2);
                super.setInt(super.getInt()+2);
                super.setCon(super.getCon()-2);
                super.setSpeed(30);
                break;
            case 2:
                super.setCon(super.getCon()+2);
                super.setCha(super.getCha()+2);
                super.setStr(super.getStr()-2);
                super.setSpeed(20);
                break;
            case 3:
                switch(j){
                    case 1:
                        super.setStr(super.getStr()+2);
                        break;
                    case 2:
                        super.setDex(super.getDex()+2);
                        break;
                    case 3:
                        super.setCon(super.getCon()+2);
                        break;
                    case 4:
                        super.setInt(super.getInt()+2);
                        break;
                    case 5:
                        super.setWis(super.getWis()+2);
                        break;
                    case 6:
                        super.setCha(super.getCha()+2);
                        break;
                }
                super.setSpeed(30);
                break;
            case 4:
                super.setDex(super.getDex()+2);
                super.setCha(super.getCha()+2);
                super.setStr(super.getStr()-2);
                super.setSpeed(20);
                break;
            case 5:
            case 6:
                switch(j){
                    case 1:
                        super.setStr(super.getStr()+2);
                        break;
                    case 2:
                        super.setDex(super.getDex()+2);
                        break;
                    case 3:
                        super.setCon(super.getCon()+2);
                        break;
                    case 4:
                        super.setInt(super.getInt()+2);
                        break;
                    case 5:
                        super.setWis(super.getWis()+2);
                        break;
                    case 6:
                        super.setCha(super.getCha()+2);
                        break;
                }
                super.setSpeed(30);
                break;
        }
        super.setMods();
    }
    
    public void levelUp(int i){
        lvl++;
        if(lvl%4==0){
            switch(i){
                    case 1:
                        super.setStr(super.getStr()+1);
                        break;
                    case 2:
                        super.setDex(super.getDex()+1);
                        break;
                    case 3:
                        super.setCon(super.getCon()+1);
                        break;
                    case 4:
                        super.setInt(super.getInt()+1);
                        break;
                    case 5:
                        super.setWis(super.getWis()+1);
                        break;
                    case 6:
                        super.setCha(super.getCha()+1);
                        break;
                }
            super.setMods();
        }
    }
    
    public void updatePlayer(){
        int k=0;
        for (int i=0;i<jobs.length;i++){
            if(job.equals(jobs[i])) k = i;
        }
        switch(k){
            case 0:
                super.setHp(super.getHp()+super.getConMod()+1+rand.nextInt(12));
                super.setBab(lvl);
                super.setFort((lvl/2)+2);
                super.setReflex(lvl/3);
                super.setWill(lvl/3);
                break;
            case 1:
                super.setHp(super.getHp()+super.getConMod()+1+rand.nextInt(8));
                switch(lvl){
                    case 1:super.setBab(0);
                    case 2:super.setBab(1);
                    case 3:super.setBab(2);
                    case 4:super.setBab(3);
                    case 5:super.setBab(3);
                    case 6:super.setBab(4);
                    case 7:super.setBab(5);
                    case 8:super.setBab(6);
                    case 9:super.setBab(6);
                    case 10:super.setBab(7);
                    case 11:super.setBab(8);
                    case 12:super.setBab(9);
                    case 13:super.setBab(9);
                    case 14:super.setBab(10);
                    case 15:super.setBab(11);
                    case 16:super.setBab(12);
                    case 17:super.setBab(12);
                    case 18:super.setBab(13);
                    case 19:super.setBab(14);
                    case 20:super.setBab(15); 
                }
                super.setFort(lvl/3);
                super.setReflex((lvl/2)+2);
                super.setWill((lvl/2)+2);
                break;
            case 2:
                super.setHp(super.getHp()+super.getConMod()+1+rand.nextInt(8));
                switch(lvl){
                    case 1:super.setBab(0);
                    case 2:super.setBab(1);
                    case 3:super.setBab(2);
                    case 4:super.setBab(3);
                    case 5:super.setBab(3);
                    case 6:super.setBab(4);
                    case 7:super.setBab(5);
                    case 8:super.setBab(6);
                    case 9:super.setBab(6);
                    case 10:super.setBab(7);
                    case 11:super.setBab(8);
                    case 12:super.setBab(9);
                    case 13:super.setBab(9);
                    case 14:super.setBab(10);
                    case 15:super.setBab(11);
                    case 16:super.setBab(12);
                    case 17:super.setBab(12);
                    case 18:super.setBab(13);
                    case 19:super.setBab(14);
                    case 20:super.setBab(15); 
                }
                super.setFort((lvl/2)+2);
                super.setReflex(lvl/3);
                super.setWill((lvl/2)+2);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
        }
    }
    
}
