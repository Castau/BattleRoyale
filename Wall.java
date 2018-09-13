import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Wall extends Actor
{   
    //variable billede sat i class'en så alle metoder kan bruge det.
    private GreenfootImage smallWall;
    
    public Wall()
    {   
        //når wall sættes, laves der en ny version af billedet med med en anden scalering end originalt
        smallWall = new GreenfootImage("brick.jpg");
        smallWall.scale(50,100);
        setImage(smallWall);
    }
    public void act() 
    {
        //hvis knife eller axe rammer en wall bliver de fjernet fra verden. Ingen skud gennem vægge
       if (isTouching(Axe.class))
        {
            removeTouching(Axe.class);
        } 
       if (isTouching(Knife.class))
        {
            removeTouching(Knife.class);
        } 
       /*if (isTouching(Hole.class))
        {
            removeTouching(Hole.class); 
        }*/
    }    
    public void flip()
    {
        //metode til at vende wall-billedet 90 grader. kaldes i battleworld
        smallWall.scale(100,50);
    }
}
