/**
 * @(#)Dwarf.java
 *
 *
 * @author 
 * @version 1.00 2012/11/5
 */


public class Dwarf extends Caracter implements FightBehavior {

    public Dwarf() {
    	fightBehavior = new FightWithAxe();
    	fightBehavior = new FightWithBowAndArrow();
    }
    
    public void fight(){
    	
    }
    
    
    
    public void display(){
    	System.out.println ("\n Te lo advierto ¡Nunca confies en un elfo!");
    }
    
    
}