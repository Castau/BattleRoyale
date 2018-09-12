import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score1 extends Actor
{
    //variabler der kan bruges af alle metoder i class'en
    private int player1health;
    private boolean player1death;

    //sætter player1health i objektet score. Det er et billede som overskrives hver gang metoden kaldes i 
    // battleworld (hvilket sker hver gang battleworld acter) 
    public void setHealth1(int p1health)
    {
        player1health = p1health;
        GreenfootImage image = new GreenfootImage("Player 1\n Health:" + player1health, 24, Color.BLACK, new Color(0,0,0,0));
        setImage(image);   
    }
    public void setDeath1(boolean p1death)
    {
        //kaldes i battleworld hver gang den acter og sætter player1death lig pideath.
        player1death = p1death;
    }
    
}
