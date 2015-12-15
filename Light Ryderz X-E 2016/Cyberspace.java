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
    public Cyberspace()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        addObject(new Player1(), 50, 750);
        addObject(new Player2(), 50, 50);
        addObject(new Player3(), 750, 50);
        addObject(new Player4(), 750, 750);

    }

    public void cubeSpawn(){
        int cubeRandom = Greenfoot.getRandomNumber(4);
        int X = Greenfoot.getRandomNumber(400) + 200;
        int Y = Greenfoot.getRandomNumber(400) + 200;
        if(cubeRandom == 4){
            addObject(new PowerCubeSpeed(), X, Y);
            boolean speed = true;
        }
        if(cubeRandom == 3){
            addObject(new PowerCubeTeleport(), X, Y);
            boolean teleport = true;
        }
        if(cubeRandom == 2){
            addObject(new PowerCubeInvincibility(), X, Y);
            boolean invincibility = true;
        }
        if(cubeRandom == 1){
            addObject(new PowerCubeRockets(), X, Y);
            boolean rocket = true;
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
