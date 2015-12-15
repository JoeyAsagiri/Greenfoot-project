import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private GreenfootImage[] images;
    private int increment;
    private int action;
    private boolean geluid;
    GreenfootSound sound = new GreenfootSound("explosion.wav");
    public Explosion(){
        int size = 0, baseSize, verschil, teller;
        GreenfootImage baseImage = new GreenfootImage("Explosion.png");
        baseSize = baseImage.getWidth();
        images = new GreenfootImage[8];
        verschil = baseSize / 8;
        increment = 1;
        size = 75;
        geluid = true;
        for(teller = 0; teller < 8; teller++){
            size += verschil;
            images[teller] = new GreenfootImage(baseImage);
            images[teller].scale(size, size);
        }
    }

    public void kill(){
        Actor enemy;
        enemy = getOneObjectAtOffset(0,0, Players.class);     
        if (enemy != null)
        {
            getWorld().removeObject(enemy);
        }
    }

    public void act() {
        kill();
        setImage(images[action]);
        action += increment;
        if (geluid){
            sound.play();
            geluid = false;
        }
        if (action > 7){
            increment = -1;
            action += increment;
        }
        if (action < 0){
            getWorld().removeObject(this);  
            sound.stop();
        } 

    }
}
