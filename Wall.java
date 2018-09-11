import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Wall extends Actor
{   
    private GreenfootImage smallWall;
    
    public Wall()
    {
        smallWall = new GreenfootImage("brick.jpg");
        smallWall.scale(50,100);
        setImage(smallWall);
    }
    public void act() 
    {
       if (isTouching(Axe.class))
        {
            removeTouching(Axe.class);
        } 
       if (isTouching(Knife.class))
        {
            removeTouching(Knife.class);
        } 
    }    
    public void flip()
    {
        smallWall.scale(100,50);
    }
}
