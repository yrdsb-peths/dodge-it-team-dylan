import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int initial = 5;
    public int counter = 0;
    
    public void act()
    {
        move(initial);
        
        if(isAtEdge()) {
            resetRocket();
            counter++;
            if(counter == 5) {
                initial++;
                counter = 0;
            }
        }
    }
    
    public void resetRocket() {
        setLocation(800, Greenfoot.getRandomNumber(300));
        MyWorld world = (MyWorld) getWorld();
        world.countTick();
    }
}
