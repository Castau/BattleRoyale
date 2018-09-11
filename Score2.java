import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score2 extends Actor
{
    private int player2health;
    private boolean player2death;

    public void setHealth2(int p2health)
    {
        player2health = p2health;
        GreenfootImage image = new GreenfootImage("Player 2\n Health:" + player2health, 24, Color.BLACK, new Color(0,0,0,0));
        setImage(image);   
    }
    public void setDeath2(boolean p2death)
    {
        player2death = p2death;
    }  
}
