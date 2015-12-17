import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Cyberspace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cyberspace extends World
{
    int timer = 0;
    GreenfootSound sound = new GreenfootSound("music.mp3");    
    boolean clicked;
    public Cyberspace()
    {    
        super(800, 800, 1); 
        addObject(new Menu(), 400, 400);
        addObject(new Multi2(), 200, 500);
        addObject(new Multi3(), 200, 700);
        addObject(new Multi4(), 600, 500);
        setPaintOrder(Explosion.class, Players.class, Lynes.class, Multi4.class, Multi3.class, Multi2.class, Menu.class, PowerCubes.class);
    }
  
    public void cubeSpawn(){
        int cubeRandom = Greenfoot.getRandomNumber(5);
        int X = Greenfoot.getRandomNumber(400) + 200;
        int Y = Greenfoot.getRandomNumber(400) + 200;
        if(cubeRandom == 4){
            addObject(new PowerCubeExplosion(), X, Y);
        }
        if(cubeRandom == 3){
            addObject(new PowerCubeClean(), X, Y);
        }
        if(cubeRandom == 2){
            addObject(new PowerCubeSpeed(), X, Y);
        }
        if(cubeRandom == 1){
            addObject(new PowerCubeTeleport(), X, Y);
        }
    }

    public void powerUpSpawn(){
        timer++;
        if(timer % 180 == 0){
            cubeSpawn();
        }
    }

    public void act(){
        powerUpSpawn();
        sound.play();
    }

    public void stopped(){
        sound.stop();
    }
}
