import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rockets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rockets extends Actor
{
    /**
     * Act - do whatever the Rockets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void remove(){
        if (getX() >= 793 || getX() <= 5 || getY() >= 795 || getY() <= 5){
            getWorld().removeObject(this);
        }
    }
    public void act() 
    {
        move(6);
        remove();
       }    
}
