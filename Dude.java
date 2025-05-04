import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Our dude
 * 
 * @author Dylan Tam
 * @version May 4th, 2025
 */
public class Dude extends Actor
{
    /**
     * Act - do whatever the Dude wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + 3);
        } else if(Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - 3);
        }
    }
}
