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
        if (time > 15) {
        Actor enemy;
        enemy = getOneObjectAtOffset(0,0, Players.class);     
        if (enemy != null)
        {            
            getWorld().addObject(new Explosion(), getX(), getY());
            getWorld().removeObject(enemy);
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
