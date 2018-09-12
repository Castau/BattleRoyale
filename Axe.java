import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Axe extends Mover
{   
    // variable i klasse, så den kan bruges af alle metoder i klassen
    // giver axe et random og begrænset tal i liv, som afgør hvor langt den kastes
    int life = Greenfoot.getRandomNumber(30)+20;
    public void act() 
    {   
        //movement og decrement af liv. objekt fjernes ved 0 i liv.
        move(7.0);
        
        life--;
        
        if (life == 0)
        {
        getWorld().removeObject(this);
        
        }
    }    
}
