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
        if(isTouching(Rocket.class)) {
            removeTouching(Rocket.class);
            
            Gameover doneFor = new Gameover();
            getWorld().addObject(doneFor, 400, 150);
            Greenfoot.stop();
        } else {
            if(Greenfoot.isKeyDown("s")) {
                setLocation(getX(), getY() + 5);
            } else if(Greenfoot.isKeyDown("w")) {
                setLocation(getX(), getY() - 5);
            }   
        }
    }
}
