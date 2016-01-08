import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spelers4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spelers4 extends spelers3
{

    /**
     * Constructor for objects of class spelers4.
     * 
     */
    public spelers4()
    {
            addObject(new Player4(), 750, 750);
    }

    public void act(){
        powerUpSpawn();
        restart();
    }
    }

