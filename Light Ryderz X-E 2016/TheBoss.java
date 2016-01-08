import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class TheBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheBoss extends Actor
{
    int rotation = 0;
    int speed = 3;
    int hp = 1800;
    /**
     * Act - do whatever the TheBoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    hp--;
    move(speed);
    if(Greenfoot.getRandomNumber(100) < 5) {
    setRotation(getRotation() + Greenfoot.getRandomNumber(180));
   }
   

   List line = getObjectsInRange(100, Lynes.class);
   if (line != null){
      getWorld().removeObjects(line); 
    }
    
    if (hp <= 0){
        getWorld().removeObject(this);
    }
}    
}
