import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hole extends Actor
{
    public boolean touchWall = false;
    public boolean touchStim = false;
    public boolean touchHole = false;
    public void act() 
    {
        /*if (isTouching(Wall.class))
        {
            touchWall = true;
        }
        if (isTouching(Stimpac.class))
        {
            touchStim = true;
        }
        if (isTouching(Hole.class))
        {
           touchHole = true;
        }*/
    }    
    /*public boolean touchWall()
    {    
        return touchWall;
    }*/
    //metode til at fortælle om hole rør ved andre objekter, bruges i battleworld
    public boolean touching()
    {
        if (isTouching(Wall.class) || isTouching(Stimpac.class) || isTouching(Hole.class))
        {
        return true;
        
        }
        return false;
    }
}
