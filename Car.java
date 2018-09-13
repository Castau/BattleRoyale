import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Car extends Actor
{

    public void act()
    {
        //laver et turn når kanten af verden nåes
        move(Greenfoot.getRandomNumber(10));
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(100));
        }
        if (Greenfoot.getRandomNumber(100)<5)
        {
            turn(Greenfoot.getRandomNumber(30));
        }
        if(isTouching(Wall.class))
        {
            turn(Greenfoot.getRandomNumber(20));
        }
        if(isTouching(Hole.class))
        {
            turn(Greenfoot.getRandomNumber(60));
        }
        if(isTouching(Stimpac.class))
        {
            turn(Greenfoot.getRandomNumber(50));
        }
        
    }   
}
