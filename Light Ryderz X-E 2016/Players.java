import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Actor
{ 
    boolean left;
    boolean right;
    boolean up;
    boolean down;
    String key = Greenfoot.getKey();
    int speed = 4;       
    boolean PowerSpeed;
    boolean PowerInvincibility;
    int time;
    public void time(){
        if (PowerInvincibility){  
            time++;
            if (time >= 120) {
                PowerInvincibility = false;
                time = 0;
            }
        }
    }

    public void removeMe()
    {
        if (PowerInvincibility) {
        }
        else {
            getWorld().addObject(new Explosion(), getX(), getY());
            getWorld().removeObject(this);     
        }
    }

    public void dead(){
        Actor enemy;
        enemy = getOneObjectAtOffset(0,0, Players.class);            
        if (enemy != null)
        {  
            removeMe();            
        }      
    }

    public void powerUp(){        
        Actor CubeSpeed = getOneObjectAtOffset(0, 0, PowerCubeSpeed.class);
        Actor CubeTeleport = getOneObjectAtOffset(0,0, PowerCubeTeleport.class);
        Actor CubeClean = getOneObjectAtOffset(0, 0, PowerCubeClean.class);
        Actor CubeExplosion = getOneObjectAtOffset(0, 0, PowerCubeExplosion.class);
        List Lynes = getObjectsInRange(800, Lynes.class);
        if(CubeExplosion != null) {
            getWorld().removeObject(CubeExplosion);
            int X = Greenfoot.getRandomNumber(800);
            int Y = Greenfoot.getRandomNumber(800);
            int X2 = Greenfoot.getRandomNumber(800);
            int Y2 = Greenfoot.getRandomNumber(800);
            int X3 = Greenfoot.getRandomNumber(800);
            int Y3 = Greenfoot.getRandomNumber(800);
            int X4 = Greenfoot.getRandomNumber(800);
            int Y4 = Greenfoot.getRandomNumber(800);
            getWorld().addObject(new Explosion(), X, Y);
            getWorld().addObject(new Explosion(), X2, Y2);
            getWorld().addObject(new Explosion(), X3, Y3);
            getWorld().addObject(new Explosion(), X4, Y4);
            getWorld().addObject(new Explosion(), X, X);
            getWorld().addObject(new Explosion(), Y, Y);
            getWorld().addObject(new Explosion(), Y2, X2);
            getWorld().addObject(new Explosion(), Y3, X3);
            getWorld().addObject(new Explosion(), Y4, X4);
        }
        if(CubeClean != null) {
            getWorld().removeObject(CubeClean);
            getWorld().removeObjects(Lynes);
        }
        if(CubeSpeed != null) {
            getWorld().removeObject(CubeSpeed);
            PowerSpeed = true;
        }
        if(CubeTeleport != null) {
            getWorld().removeObject(CubeTeleport);
            int X = Greenfoot.getRandomNumber(800);
            int Y = Greenfoot.getRandomNumber(800);
            setLocation(X,Y);
            PowerInvincibility = true;            
        }        
        if (PowerSpeed){
            speed = 8;
        }
    }

    public void linesRed(){
        getWorld().addObject(new RedLyne(), getX(), getY());
    }

    public void linesYellow(){
        getWorld().addObject(new YellowLyne(), getX(), getY());
    }

    public void linesBlue(){
        getWorld().addObject(new BlueLyne(), getX(), getY());
    }

    public void linesWhite(){
        getWorld().addObject(new WhiteLyne(), getX(), getY());
    }

    public void moving1(){
        if (Greenfoot.isKeyDown("right"))
        {
            left = false;
            up = false;
            down = false;
            right = true;
        }
        if (Greenfoot.isKeyDown("up"))
        {
            right = false;
            left = false;
            down = false;
            up = true;
        }
        if (Greenfoot.isKeyDown("down"))
        {
            right = false;
            up = false;
            left = false;
            down = true;
        }
        if (Greenfoot.isKeyDown("left"))
        {
            right = false;
            up = false;
            down = false;
            left = true;
        }
        if (left)
        {    
            setRotation(180);
        }
        if (right)
        {
            setRotation(0);
        }
        if (up)
        {     
            setRotation(270);
        }
        if (down)
        {
            setRotation(90);
        }
    }

    public void moving2(){
        if (Greenfoot.isKeyDown("d"))
        {
            left = false;
            up = false;
            down = false;
            right = true;
        }
        if (Greenfoot.isKeyDown("w"))
        {
            right = false;
            left = false;
            down = false;
            up = true;
        }
        if (Greenfoot.isKeyDown("s"))
        {
            right = false;
            up = false;
            left = false;
            down = true;
        }
        if (Greenfoot.isKeyDown("a"))
        {
            right = false;
            up = false;
            down = false;
            left = true;
        }
        if (left)
        {    
            setRotation(180);
        }
        if (right)
        {
            setRotation(0);   
        }
        if (up)
        {     
            setRotation(270);
        }
        if (down)
        {
            setRotation(90);
        }
    }

    public void moving3(){
        setRotation(180);
        if (Greenfoot.isKeyDown("6"))
        {
            left = false;
            up = false;
            down = false;
            right = true;
        }
        if (Greenfoot.isKeyDown("8"))
        {
            right = false;
            left = false;
            down = false;
            up = true;
        }
        if (Greenfoot.isKeyDown("5"))
        {
            right = false;
            up = false;
            left = false;
            down = true;
        }
        if (Greenfoot.isKeyDown("4"))
        {
            right = false;
            up = false;
            down = false;
            left = true;
        }
        if (left)
        {    
            setRotation(180);
        }
        if (right)
        {
            setRotation(0);    
        }
        if (up)
        {     
            setRotation(270);
        }
        if (down)
        {
            setRotation(90);
        }
    }

    public void moving4(){
        setRotation(180);
        if (Greenfoot.isKeyDown("l"))
        {
            left = false;
            up = false;
            down = false;
            right = true;
        }
        if (Greenfoot.isKeyDown("i"))
        {
            right = false;
            left = false;
            down = false;
            up = true;
        }
        if (Greenfoot.isKeyDown("k"))
        {
            right = false;
            up = false;
            left = false;
            down = true;
        }
        if (Greenfoot.isKeyDown("j"))
        {
            right = false;
            up = false;
            down = false;
            left = true;
        }
        if (left)
        {    
            setRotation(180);
        }
        if (right)
        {
            setRotation(0);   
        }
        if (up)
        {     
            setRotation(270);
        }
        if (down)
        {
            setRotation(90);
        }
    }

    public void act() 
    {
    }    
}
