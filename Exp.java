import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exp extends Actor
{
    /**
     * Act - do whatever the Exp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b;
    int count = 0;
    public Exp(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        count++;
        if (count > 400)
        getWorld().removeObject(this);// Add your action code here.
    }
}
