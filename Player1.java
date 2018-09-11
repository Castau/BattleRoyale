import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player1 extends Actor
{    
    private int health;
    private boolean shooting = false;
    private boolean isDead = false;
    
    public Player1(){
        this(100);
    }
    public Player1(int health){
        this.health = health;
    }
    public void act() 
    {   
        if(health<=0)
        {
                isDead = true;
        }
        
        if (Greenfoot.isKeyDown("up") && 
        getOneObjectAtOffset(0,-25,Wall.class) ==null)
        {
            setRotation(270); 
            move(5);  
        }
        if (Greenfoot.isKeyDown("down") && 
        getOneObjectAtOffset(0,25,Wall.class) ==null)
        {
            setRotation(90); 
            move(5); 
        }
        if (Greenfoot.isKeyDown("left") && 
        getOneObjectAtOffset(-25,0,Wall.class) ==null) 
        {
            setRotation(180); 
            move(5);
        }
        if (Greenfoot.isKeyDown("right") && 
        getOneObjectAtOffset(25,0,Wall.class) ==null) 
        {
            setRotation(0); 
            move(5);
        }
        if ((Greenfoot.isKeyDown("1")))
        {
            if(shooting == false)
            {
            hit();
            shooting = true;
            }
        }
        else
        {
        shooting = false;
        }
        if (isTouching(Axe.class))
        {
            health += -35;
            removeTouching(Axe.class);
        }
    }       
    private void hit()
    {
     Knife knife = new Knife();
     getWorld().addObject(knife,getX(),getY());
     knife.setRotation(getRotation());
    }
    public boolean isDead()
    {
        return isDead;
    }
    public int getHealth()
    {
        return health;
    }
}
