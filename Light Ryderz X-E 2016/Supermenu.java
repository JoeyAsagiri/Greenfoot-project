import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Cyberspace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Supermenu extends World
{
    int timer = 0;
    public static final GreenfootSound sound = new GreenfootSound("music.mp3");  
    boolean clicked;
    public Supermenu()
    {    
        super(800, 800, 1); 
        addObject(new Menu(), 400, 400);
        addObject(new Multi2(), 200, 500);
        addObject(new Multi3(), 200, 700);
        addObject(new Multi4(), 600, 500);
        addObject(new Boss(), 600, 700);
        setPaintOrder(Explosion.class, Players.class, Lynes.class, Multi4.class, Multi3.class, Multi2.class, Menu.class, PowerCubes.class);
    }  
public void act(){
    sound.play();
    Bossfight.sound.stop();
}

public void stopped(){
 sound.stop();
}
}
