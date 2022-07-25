import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vidas extends Actor
{
    /**
     * Act - do whatever the Vidas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int vidas = 0;
    public Vidas()
    {
        setImage(new GreenfootImage("VIDAS: " + vidas, 40, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
        setImage(new GreenfootImage("VIDAS: " + vidas, 40, Color.WHITE, Color.BLACK));// Add your action code here.
    }
}
