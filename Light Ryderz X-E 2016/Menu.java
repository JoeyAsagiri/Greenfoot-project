import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{    
    boolean clicked = false;
    public void create2(){
        if (clicked != true){
            if(Greenfoot.mouseClicked(this)){
                Greenfoot.setWorld(new spelers2());
            }
        }
    } 

    public void create3(){
        if (clicked != true){
            if(Greenfoot.mouseClicked(this)){
               Greenfoot.setWorld(new spelers3());
            }
        }
    }

    public void create4(){
        if (clicked != true){
            if(Greenfoot.mouseClicked(this)){
                Greenfoot.setWorld(new spelers4());
            }
        }
    }

    public void boss(){
        if (clicked != true){
            if(Greenfoot.mouseClicked(this)){
             Greenfoot.setWorld(new Bossfight());   
             Supermenu.sound.stop();           
            }
        }
    }

    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }    
}
