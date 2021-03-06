package workspace;

import javaKat.*;

public class Paddle extends Entity {
    public Paddle() {
        super();
        Album album = new Album(this);
        album.addPageWithPicture("images/Paddle.png","main");
        album.setPage("main");
        album.setMovementMode(MovementMode.BY_RECT);
        
        bindCodeToAction("up",
                (a) -> {rect.offsetYAccelerationBy(-5.0);},
                (a) -> {rect.offsetYAccelerationBy(5.0);});
                
        bindCodeToAction("down",
                (a) -> {rect.setYAcceleration(5.0);},
                (a) -> {rect.offsetYAccelerationBy(-5.0);});
        rect.setMaxYSpeed(5.0);
        rect.setFriction(5.0);
        resizeByCenter(album.getCurrentPageWidth(),album.getCurrentPageHeight());
    }
    
    public void subUpdate() {
    }
    
    public Reaction collidedWith(Entity input) {
        System.out.println(input);
        if (input instanceof Ball) {
            return Reaction.REFLECT;
        }
        if (input instanceof Border) {
            return Reaction.DEFLECT;
        }
        return Reaction.AGREE;
    }
}
    