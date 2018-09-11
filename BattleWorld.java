import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BattleWorld extends World
{
        private Player1 player1;
        private Player2 player2;
        private Score1 score1;
        private Score2 score2;
    public BattleWorld()
    {   
        super(600, 400, 1); 
        prepare();
    }
    public void win()
    {
        {
            showText("Player 1 is dead! Player 2 wins!", 280,280);
        }
       
    }
        public void win2()
    {
        {
            showText("Player 2 is dead! Player 1 wins!", 280,280);
        }
       
    }
    private void prepare()
    {
        player1 = new Player1();
        addObject(player1,30,40);
        player2 = new Player2();
        addObject(player2,570,360);
        Wall wall = new Wall();
        addObject(wall,120,40);
        Wall wall2 = new Wall();
        addObject(wall2,480,360);
        Wall wall3 = new Wall();
        wall3.flip();
        addObject(wall3,300,200);
        score1 = new Score1();  
        score2 = new Score2();
        addObject(score1,220,30);
        addObject(score2,380,30);
    }
    public void act()
    {
        score1.setHealth1(player1.getHealth());
        score2.setHealth2(player2.getHealth());
        score1.setDeath1(player1.isDead());
        score2.setDeath2(player2.isDead());
        if(player1.isDead())
        {
           win(); 
        }
        if(player2.isDead())
        {
            win2();
        } 
    }
}
