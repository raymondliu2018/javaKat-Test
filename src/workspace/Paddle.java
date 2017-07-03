package workspace;

import javaKat.*;

public class Paddle extends Entity {
    public Paddle() {
        super();
        sprite.addImage("images/Paddle.png","main");
        sprite.setImage("main");
        
        bindCodeToAction("up",
                (a) -> {rect.offsetYVelocityBy(-5.0);},
                (a) -> {rect.offsetYVelocityBy(5.0);});
                
        bindCodeToAction("down",
                (a) -> {rect.offsetYVelocityBy(5.0);},
                (a) -> {rect.offsetYVelocityBy(-5.0);});
        
        resizeByCenter();
    }
    
    public void subUpdate() {
    }
}
    