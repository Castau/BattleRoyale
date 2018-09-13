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
        super(1200, 800, 1); 
        // metode der sætter banen op som vi ønsker det
        prepare();
    }
        // text der bliver vist når en af de to spillere dør
        // stopper spillet når en af de to spillere dør
        // afspiller lydfil når en spiller dør
    public void win()
    {   
        {
            showText("Player 1 is dead! \n\nPLAYER 2 WINS!", 600,530);
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
            showText("Player 2 is dead! \n\nPLAYER 1 WINS!", 600,530);
            Greenfoot.stop();
            Greenfoot.playSound("death2.mp3");
        }
    }
    
        //bliver brugt i battleWorld() til at sætte objekterne hvor det ønskes ved nyt spil
    private void prepare()
    {   
        player1 = new Player1();
        addObject(player1,1170,760);
        player2 = new Player2();
        addObject(player2,30,40);
        Wall wall = new Wall();
        addObject(wall,120,40);
        Wall wall2 = new Wall();
        addObject(wall2,1080,760);
        Wall wall3 = new Wall();
        Wall wall4 = new Wall();
        addObject(wall4,900,150);
        Wall wall5 = new Wall();
        addObject(wall5,300,650);
        Stimpac stimpac = new Stimpac();
        addObject(stimpac, 1180,20);
        Stimpac stimpac1 = new Stimpac();
        addObject(stimpac1, 20,770);
        Stimpac stimpac2 = new Stimpac();
        addObject(stimpac2, 590,340);
        Stimpac stimpac3 = new Stimpac();
        addObject(stimpac3, 590,460);
        //kalder metode fra wall-class til at vende wall3 90 grader
        wall3.flip();
        addObject(wall3,600,400);
        score1 = new Score1();  
        score2 = new Score2();
        addObject(score2,420,30);
        addObject(score1,680,30);
        Greenfoot.playSound("UTback.mp3");
        Car car = new Car();
        addObject(car,Greenfoot.getRandomNumber(1100)+50,Greenfoot.getRandomNumber(700)+50);
        
        //spawner 6 huller (fremfor at tilføje automatisk)
        for(int i = 1; i < 7; i++)
        { 
         Hole hole = new Hole();
         addObject(hole,Greenfoot.getRandomNumber(1100)+50,Greenfoot.getRandomNumber(700)+50);
         //fjerner et hul hvis det rør ved andre objekter - kalder en metode fra Hole class'en
         if(hole.touching())
         {
             removeObject(hole);
             i--;
             
         }
        }
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
        /*while(hole.touching())
         {
             removeObject(hole);
             Hole hole = new Hole();
             addObject(hole,Greenfoot.getRandomNumber(1100)+50,Greenfoot.getRandomNumber(700)+50);
         }*/
    }
}
