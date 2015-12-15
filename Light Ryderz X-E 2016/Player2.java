import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Players
{
    public void act() 
    {
        powerUp();
        move(speed);
        moving2();
        linesYellow();
        dead();       
    }      
}
