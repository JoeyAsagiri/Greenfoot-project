import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class spelers2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spelers2 extends World
{
    int timer;

    /**
     * Constructor for objects of class spelers2.
     * 
     */
    public spelers2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        addObject(new Player1(), 50, 750);
        addObject(new Player2(), 50, 50); 


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

    public void restart(){
        if(Greenfoot.isKeyDown("r")){
            Greenfoot.setWorld(new Supermenu());
           
        }
    }
    public void act(){
        powerUpSpawn();
        restart();        
    }

}
