/**
 * @(#)Human.java
 *
 *
 * @author 
 * @version 1.00 2012/11/5
 */


public class Human extends Caracter {

    public Human(){
    	fightBehavior = new FightWithSword();
    }
    
    public void display(){
    	System.out.println ("\nYo no temo a la muerte");
    }
           
}