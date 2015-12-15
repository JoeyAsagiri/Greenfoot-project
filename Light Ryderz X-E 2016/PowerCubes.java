import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerCubes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerCubes extends Actor
{
    int time = 0;
    public void selfDestruct(){
        time++;
        if(time == 360)
        {
            getWorld().removeObject(this);
        }
    }

    public void act() 
    {
        
    }    
}
