import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(800, 300, 1);
        
        Dude dude = new Dude();
        addObject(dude, 80, 150);
    }
}
