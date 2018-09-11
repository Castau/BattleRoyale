import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Axe extends Mover
{
    int life = Greenfoot.getRandomNumber(30)+30;
    public void act() 
    {
        move(10.0);
        
        life--;
        
        if (life == 0)
        {
        getWorld().removeObject(this);
        
        }
    }    
}
