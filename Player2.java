import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player2 extends Actor
{
    private int health;
    private boolean shooting = false;
    private boolean isDead = false;
    
    public Player2(){
        this(100);
    }
    public Player2(int health){
        this.health = health;
    }
    public void act() 
    {
        if(health<=0)
        {
            isDead = true;
        }
        
        if (Greenfoot.isKeyDown("w") && 
        getOneObjectAtOffset(0,-25,Wall.class) ==null)
        {
            setRotation(270); 
            move(5);  
        }
        if (Greenfoot.isKeyDown("s") && 
        getOneObjectAtOffset(0,25,Wall.class) ==null)
        {
            setRotation(90); 
            move(5); 
        }
        if (Greenfoot.isKeyDown("a") && 
        getOneObjectAtOffset(-25,0,Wall.class) ==null) 
        {
            setRotation(180); 
            move(5);
        }
        if (Greenfoot.isKeyDown("d") && 
        getOneObjectAtOffset(25,0,Wall.class) ==null) 
        {
            setRotation(0); 
            move(5);
        }
         if ((Greenfoot.isKeyDown("e")))
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
             if (isTouching(Knife.class))
        {
            health += -35;
            removeTouching(Knife.class);
        }
    }       
    private void hit()
    {
     Axe axe = new Axe();
     getWorld().addObject(axe,getX(),getY());
     axe.setRotation(getRotation());
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
//("e".equals(Greenfoot.getKey()))
