import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Players
{
    String Up = "up";
    public void act() 
    {
        powerUp();
        move(speed);
        moving1();
        linesBlue();
        dead();     
        time();
        clicked();
        
    }    
}
