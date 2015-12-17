import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lynes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lynes extends Actor
{
    int time = 0; 
    public void dead(){   
        time++;
        Actor enemy = getOneObjectAtOffset(0,0, Players.class); 
        if (time > 20) {   
        if (enemy != null)
        {                        
            Players p = (Players) enemy;
            p.removeMe();
        }
    }
    }
    /**
     * Act - do whatever the Lynes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
