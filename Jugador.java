import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld myWorld = (MyWorld)getWorld();
    int r, g, b, jugador;
    int velocidad = 3;
    int count = 0;
    public Jugador(int jugador, int r, int g,int b)
    {
        setRotation(180);
        this.r = r;
        this.g = g;
        this.b = b;
        this.jugador = jugador;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        count++;
        getWorld().addObject(new Cola(r, g, b),getX(),getY());
        move(velocidad);
        moveAround();
        //Add your action code here.
    }
    
    public void moveAround()
    {
       if(this.jugador == 0){ 
            if(Greenfoot.isKeyDown("right"))
                setRotation(0);
            if(Greenfoot.isKeyDown("left"))
                setRotation(180);
            if(Greenfoot.isKeyDown("up"))
                setRotation(270);
            if(Greenfoot.isKeyDown("down"))
            setRotation(90);
        }
        if(this.jugador == 4){
                if(Greenfoot.isKeyDown("d"))
                    setRotation(0);
                if(Greenfoot.isKeyDown("a"))
                    setRotation(180);
                if(Greenfoot.isKeyDown("w"))
                    setRotation(270);
                if(Greenfoot.isKeyDown("s"))
                    setRotation(90);
        } 
    }
}
