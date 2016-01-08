import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spelers3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spelers3 extends spelers2
{

    /**
     * Constructor for objects of class spelers3.
     * 
     */
    public spelers3()
    {
        addObject(new Player3(), 750, 50);
    }

    public void act(){
        powerUpSpawn();
        restart();
    }
}
