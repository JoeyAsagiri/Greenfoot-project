import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player3 extends Players
{ 
    public void act() 
    {
        powerUp();
        move(speed);
        moving3();
        linesRed();
        dead();
        time();
    }      
}
