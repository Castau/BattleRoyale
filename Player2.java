
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player2 extends Actor
{
    // variabler uden for metoderne, så de kan bruges af alle metoder. Player holder selv styr på liv og død og om han skyder
    private int health;
    private boolean shooting = false;
    private boolean isDead = false;
    
    //constructor metode - kalder sig selv og sætter players liv til 100
    public Player2()
    {
        //kalder sig selv (metoden neden under) med parameteren sat til 100
        this(100);
    }
    public Player2(int health)
    {
        //samme metode som ovenfor men med parameter for liv. Sætter sit eget liv lige det den får ind når den kaldes
        this.health = health;
    }
    public void act() 
    {
        // sætter isDead til true når spillerens liv er mindre eller lig 0
        if(health<=0)
        {
            isDead = true;
        }
        // hvis up trykkes ned og der ikke er en wall tæt på i den retning, gå frem
        if (Greenfoot.isKeyDown("w") && 
        getOneObjectAtOffset(0,-25,Wall.class) ==null)
        {
            setRotation(270); 
            move(3);  
        }
        // hvis down trykkes ned og der ikke er en wall tæt på i den retning, gå tilbage
        if (Greenfoot.isKeyDown("s") && 
        getOneObjectAtOffset(0,25,Wall.class) ==null)
        {
            setRotation(90); 
            move(3); 
        }
        // hvis left trykkes ned og der ikke er en wall tæt på i den retning, gå left
        if (Greenfoot.isKeyDown("a") && 
        getOneObjectAtOffset(-25,0,Wall.class) ==null) 
        {
            setRotation(180); 
            move(3);
        }
        // hvis right trykkes ned og der ikke er en wall tæt på i den retning, gå right
        if (Greenfoot.isKeyDown("d") && 
        getOneObjectAtOffset(25,0,Wall.class) ==null) 
        {
            setRotation(0); 
            move(3);
        }
        // hvis 1 trykkes ned og shooting er false skydes og shooting sættes til true (kun et skud pr key press)
         if ((Greenfoot.isKeyDown("e")))
        {
            if(shooting == false)
            {
            hit();
            shooting = true;
            }
        }
        // hvis 1 ikke trykkes ned sættes shooting til false igen
        else
        {
        shooting = false;
        }
        //hvis spiller 1 rør axe mistes 35 liv og axe fjernes 
        //lydfil afspilles hver gang spilleren mister health så længe han ikke er død
        if (isTouching(Knife.class))
        {
            health += -35;
            removeTouching(Knife.class);
            if(health > 0)
            {
            Greenfoot.playSound("wound2.mp3");
            }
        }
    }       
    private void hit()
    // når hit kaldes laves en ny knife og rotationen sættes til den samme som player og lydfil afspilles
    {
     Axe axe = new Axe();
     getWorld().addObject(axe,getX(),getY());
     axe.setRotation(getRotation());
     Greenfoot.playSound("weapon2.mp3");
    }
    // hvis player dør retunerer denne metode isDead. kaldes i battleworld
    public boolean isDead()
    {
        return isDead;
    }
    //retunerer healt, kaldes i battleworld og sættes i score 
    public int getHealth()
    {
        return health;
    }
}
//("e".equals(Greenfoot.getKey()))
