import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class uprocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class uprocket extends Rockets
{
    /**
     * Act - do whatever the uprocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX(),getY() - 6);
       remove();
    }    
}
