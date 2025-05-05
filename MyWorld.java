import greenfoot.*;

public class MyWorld extends World {
    
    public int score = 0;
    Counter scoreCard;
    
    public MyWorld() {
        super(800, 300, 1);
        
        Dude dude = new Dude();
        addObject(dude, 80, 150);
        
        Rocket rocket = new Rocket();
        addObject(rocket, 790, 150);
        rocket.setRotation(180);
        
        scoreCard = new Counter("Dodge Count: ");
        addObject(scoreCard, 720, 20);
    }
    
    public void countTick() {
        score++;
        scoreCard.setValue(score);
    }
}
