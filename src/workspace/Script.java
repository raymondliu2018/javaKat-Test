package workspace; 
import javaKat.*;
import java.awt.event.KeyEvent;

public class Script implements SuperScript {
    public static void init() {
        Camera.setBackground(Utility.scaleImage("images/background.png",2));
        
        //Creating Paddles and setting initial positions
        Paddle leftPaddle = new Paddle();
        leftPaddle.getRect().setCenterY((GameMaster.getHeight()/2));
        leftPaddle.getRect().setCornerX(0);
        
        Paddle rightPaddle = new Paddle();
        rightPaddle.getRect().setCenterY((GameMaster.getHeight()/2));
        rightPaddle.getRect().setCornerX(GameMaster.getWidth() -
                rightPaddle.getRect().getWidth());
                
        //Controls for Paddles
        leftPaddle.bindKeyToAction('w',"up");
        leftPaddle.bindKeyToAction('s',"down");
        
        rightPaddle.bindKeyToAction(KeyEvent.VK_UP,"up");
        rightPaddle.bindKeyToAction(KeyEvent.VK_DOWN,"down");
        
        //GameMaster.pause(2000);
    }
    
    public static void main(String [] args) {
        GameMaster.start("NAME");
    }
    
    public static void loop() {
    }
    
    public static void end() {
    }
}

