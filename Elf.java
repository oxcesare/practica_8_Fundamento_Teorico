/**
 * @(#)Elf.java
 *
 *
 * @author 
 * @version 1.00 2012/11/5
 */


public class Elf extends character {

    public Elf() {
    	fightBehavior = new FightWithBowAndArrow();
    }
    
    public void display(){
    	System.out.println ("\n Saludos desde Rivendel");
    }
    
}