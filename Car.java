import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Car extends Actor
{

    public void act()
    {
        //random fart på bilen
        move(Greenfoot.getRandomNumber(10));
        //laver et turn når kanten af verden nåes
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(100));
        }
        //laver et random turn 5% af tiden
        if (Greenfoot.getRandomNumber(100)<5)
        {
            turn(Greenfoot.getRandomNumber(30));
        }
        //laver et turn når bilen rør en wall
        if(isTouching(Wall.class))
        {
            turn(Greenfoot.getRandomNumber(20));
        }
        //laver et turn når bilen rør et hole
        if(isTouching(Hole.class))
        {
            turn(Greenfoot.getRandomNumber(60));
        }
        //laver et turn når bilen rør en stimpac
        if(isTouching(Stimpac.class))
        {
            turn(Greenfoot.getRandomNumber(50));
        }
        
    }   
}
