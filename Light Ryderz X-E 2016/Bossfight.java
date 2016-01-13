import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bossfight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bossfight extends World
{
    /**
     * Constructor for objects of class Bossfight.
     * 
     */
    public Bossfight()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800,800, 1);
        addObject(new TheBoss(), 400,400);
        addObject(new Rocketplayer(), 50, 50);
          
    }
        public void restart(){
        if(Greenfoot.isKeyDown("r")){
            Greenfoot.setWorld(new Supermenu());
        }
    }
        public void act(){
        restart();
    }
    public void stopped(){
    }
}
