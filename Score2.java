import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score2 extends Actor
{
    //variabler der kan bruges af alle metoder i class'en
    private int player2health;
    private boolean player2death;

    //sætter player1health i objektet score. Det er et billede som overskrives hver gang metoden kaldes i 
    // battleworld (hvilket sker hver gang battleworld acter) 
    public void setHealth2(int p2health)
    {
        player2health = p2health;
        GreenfootImage image = new GreenfootImage("Player 2\n Health:" + player2health, 24, Color.BLACK, new Color(0,0,0,0));
        setImage(image);   
    }
    public void setDeath2(boolean p2death)
    {
        //kaldes i battleworld hver gang den acter og sætter player1death lig p2death.
        player2death = p2death;
    }  
}
