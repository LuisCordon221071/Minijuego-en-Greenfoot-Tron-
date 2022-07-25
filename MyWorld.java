import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Jugador azulJugador = new Jugador(0,0,0,255);
    Jugador rojoJugador = new Jugador(4,255,0,0);
    Vidas azulVidas = new Vidas();
    Vidas rojoVidas = new Vidas();
    int count = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(azulJugador,900, 250);
        addObject(azulVidas,800, 100);
        addObject(rojoJugador,0, 250);
        addObject(rojoVidas, 100, 100);
    }
        public void act()
    {
        count++;
        if (count > 400){
        addObject(new Exp(0, 255, 0), Greenfoot.getRandomNumber(getWidth()-1), Greenfoot.getRandomNumber(getHeight()-1));
        count = 0;
        }
    }
}
