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
                getWorld().addObject(new Player1(), 50, 750);
                getWorld().addObject(new Player2(), 50, 50); 
                setImage("Cyberspace.png");
                setLocation(400,400);
                clicked = true;
                getWorld().setPaintOrder(Explosion.class, Players.class, Lynes.class, PowerCubes.class, Multi2.class, Multi3.class, Multi4.class, Turbo.class);
            }
        }
    } 

    public void create3(){
        if (clicked != true){
            if(Greenfoot.mouseClicked(this)){
                getWorld().addObject(new Player1(), 50, 750);
                getWorld().addObject(new Player2(), 50, 50);
                getWorld().addObject(new Player3(), 750, 50);     
                setImage("Cyberspace.png");
                setLocation(400,400);
                clicked = true;
                getWorld().setPaintOrder(Explosion.class, Players.class, Lynes.class, PowerCubes.class, Multi3.class, Multi2.class, Multi4.class, Turbo.class);
            }
        }
    }

    public void create4(){
        if (clicked != true){
            if(Greenfoot.mouseClicked(this)){
                getWorld().addObject(new Player1(), 50, 750);
                getWorld().addObject(new Player2(), 50, 50);
                getWorld().addObject(new Player3(), 750, 50);
                getWorld().addObject(new Player4(), 750, 750);
                setImage("Cyberspace.png");
                setLocation(400,400);
                clicked = true;
                getWorld().setPaintOrder(Explosion.class, Players.class, Lynes.class, PowerCubes.class, Multi4.class, Multi3.class, Multi2.class, Menu.class, Turbo.class);
            }
        }
    }

    public void turbo(){
        if (clicked != true){
            if(Greenfoot.mouseClicked(this)){
                getWorld().addObject(new Player1(), 50, 750);
                getWorld().addObject(new Player2(), 50, 50);
                getWorld().addObject(new Player3(), 750, 50);
                getWorld().addObject(new Player4(), 750, 750);
                setImage("Cyberspace.png");
                setLocation(400,400);
                clicked = true;
                getWorld().setPaintOrder(Explosion.class, Players.class, Lynes.class, PowerCubes.class, Turbo.class, Multi4.class, Multi3.class, Multi2.class, Menu.class);
                getWorld().addObject(new PowerCubeSpeed(), 50, 750);
                getWorld().addObject(new PowerCubeSpeed(), 50, 50);
                getWorld().addObject(new PowerCubeSpeed(), 750, 50);
                getWorld().addObject(new PowerCubeSpeed(), 750, 750);
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
