/**
 * @(#)Warrior.java
 *
 *
 * @author 
 * @version 1.00 2012/11/5
 */


public class Warrior {

    public Warrior() {
    }
    
    
    public abstract void display(){
    	
    }

    public void setFightBehavior(FightBehavior weapon){
    	fightBehavior = weapon;
    }
    
    public void performFigth(){
    	fightBehavior.fight();
    }
    
    public void walk(){
    	System.out.println ("Ha caminar se ha dicho");
    }
           
}