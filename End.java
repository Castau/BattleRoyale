import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class End extends Actor
{
    public void act() 
    {
        
    } 
    public void ending1()
    {
        GreenfootImage image = new GreenfootImage("Player 1 wins" , 54, Color.BLACK, new Color(0,0,0,0));
        setImage(image);  
        if (isTouching(Hole.class))
        {
            removeTouching(Hole.class);
        }
        if (isTouching(Car.class))
        {
            removeTouching(Car.class);
        }
    }
    public void ending2()
    {
        GreenfootImage image = new GreenfootImage("Player 2 wins" , 54, Color.BLACK, new Color(0,0,0,0));
        setImage(image);   
        if (isTouching(Hole.class))
        {
            removeTouching(Hole.class);
        }
        if (isTouching(Car.class))
        {
            removeTouching(Car.class);
        }
    }
}
