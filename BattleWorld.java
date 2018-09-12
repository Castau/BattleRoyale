import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BattleWorld extends World
{       
        // variabler her kan bruges af alle metoder i class'en
        private Player1 player1;
        private Player2 player2;
        private Score1 score1;
        private Score2 score2;
    public BattleWorld()
    {   
        super(600, 400, 1); 
        // metode der sætter banen op som vi ønsker det
        prepare();
    }
        // text der bliver vist når en af de to spillere dør
        // stopper spillet når en af de to spillere dør
        // afspiller lydfil når en spiller dør
    public void win()
    {   
        {
            showText("Player 1 is dead! \n\nPLAYER 2 WINS!", 300,280);
            Greenfoot.stop();
            Greenfoot.playSound("death1.mp3");
        }
       
    }
        // text der bliver vist når en af de to spillere dør
        // stopper spillet når en af de to spillere dør
        // afspiller lydfil når en spiller dør
        public void win2()
    {
        {
            showText("Player 2 is dead! \n\nPLAYER 1 WINS!", 300,280);
            Greenfoot.stop();
            Greenfoot.playSound("death2.mp3");
        }
       
    }
    
        //bliver brugt i battleWorld() til at sætte objekterne hvor det ønskes ved nyt spil
    private void prepare()
    {   
        player1 = new Player1();
        addObject(player1,570,360);
        player2 = new Player2();
        addObject(player2,30,40);
        Wall wall = new Wall();
        addObject(wall,120,40);
        Wall wall2 = new Wall();
        addObject(wall2,480,360);
        Wall wall3 = new Wall();
        //kalder metode fra wall-class til at vende wall3 90 grader
        wall3.flip();
        addObject(wall3,300,200);
        score1 = new Score1();  
        score2 = new Score2();
        addObject(score1,220,30);
        addObject(score2,380,30);
    }
    public void act()
    {   
        // tjek på spilleres health og informere score om health og død og kald af win metode ved død
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
