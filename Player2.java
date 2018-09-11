import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player2 extends Actor
{
        private int health;
    
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
        getWorldOfType(testworld.class).win2();
        }
        
        if (Greenfoot.isKeyDown("w") && 
        getOneObjectAtOffset(0,0,Wall.class) ==null)
        {
            setRotation(270); 
            move(5);  
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setRotation(90); 
            move(5); 
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setRotation(180); 
            move(5);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setRotation(0); 
            move(5);
        }
        if (Greenfoot.isKeyDown("e"))
        {
            hit();
        }
    }   
    public void hit()
    {
        
        
        
        /*
         hit other player if within radius
         weapon gives + to hit
         
        */
    }
}
