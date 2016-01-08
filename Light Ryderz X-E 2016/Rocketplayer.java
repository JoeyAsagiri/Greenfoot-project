import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocketplayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocketplayer extends Players
{
    int time = 100;
    /**
     * Act - do whatever the Rocketplayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void shoot(){
        time++;
        if (Greenfoot.isKeyDown("z")){
            if (time > 30){
                if (right){
            getWorld().addObject(new Rockets(),getX() + 60 ,getY());           
        }
                if (up){
            getWorld().addObject(new uprocket(),getX(),getY() - 60);           
        }
                if (down){
            getWorld().addObject(new downrocket(),getX(),getY() + 60);           
        }
                if (left){
            getWorld().addObject(new leftrocket(),getX() - 60 ,getY());           
        }
        time = 0;
        }
        }
    }
    public void act() 
    {
        powerUp();
        move(speed);
        moving1();
        dead();     
        time();

        
        shoot();
    }    
}
