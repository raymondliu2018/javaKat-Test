package workspace; 
import java.awt.Color;
import javaKat.*;
import java.awt.event.KeyEvent;

public class Script implements SuperScript {
    private static int leftPlayerScoreInt, rightPlayerScoreInt;
    private static Tag leftPlayerScoreTag, rightPlayerScoreTag;
    
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
        
        //Creating Ball and setting initial positiion
        Ball ball = new Ball();
        ball.getRect().setCenterX(GameMaster.getWidth()/2);
        ball.getRect().setCenterY(GameMaster.getHeight()/2);
        //GameMaster.pause(2000);
        leftPlayerScoreTag = new Tag();
        leftPlayerScoreTag.setColor(Color.GREEN);
        leftPlayerScoreTag.setMessage(() -> {return Integer.toString(leftPlayerScoreInt);});
        leftPlayerScoreTag.setMovementMode(MovementMode.BY_INPUT);
        leftPlayerScoreTag.setCenterX(GameMaster.getWidth()/4);
        leftPlayerScoreTag.setCenterY(GameMaster.getHeight()/2);
        
        rightPlayerScoreTag = new Tag();
        rightPlayerScoreTag.setColor(Color.GREEN);
        rightPlayerScoreTag.setMessage(() -> {return Integer.toString(leftPlayerScoreInt);});
        rightPlayerScoreTag.setMovementMode(MovementMode.BY_INPUT);
        rightPlayerScoreTag.setCenterX(GameMaster.getWidth()/4);
        rightPlayerScoreTag.setCenterY(GameMaster.getHeight()/2);
    }
    
    public static void main(String [] args) {
        GameMaster.start("NAME");
    }
    
    public static void loop() {
    }
    
    public static void end() {
    }
}

