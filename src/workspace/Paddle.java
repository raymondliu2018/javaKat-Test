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
                (a) -> {rect.offsetYVelocityBy(-5.0);},
                (a) -> {rect.offsetYVelocityBy(5.0);});
                
        bindCodeToAction("down",
                (a) -> {rect.offsetYVelocityBy(5.0);},
                (a) -> {rect.offsetYVelocityBy(-5.0);});
        
        resizeByCenter(album.getCurrentPageWidth(),album.getCurrentPageHeight());
    }
    
    public void subUpdate() {
    }
    
}
    