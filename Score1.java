import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score1 extends Actor
{
    private int player1health;
    private boolean player1death;

    public void setHealth1(int p1health)
    {
        player1health = p1health;
        GreenfootImage image = new GreenfootImage("Player 1\n Health:" + player1health, 24, Color.BLACK, new Color(0,0,0,0));
        setImage(image);   
    }
    public void setDeath1(boolean p1death)
    {
        player1death = p1death;
    }
    
}
