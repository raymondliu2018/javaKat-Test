package workspace;

import javaKat.*;

public class Ball extends Entity implements Ender{
    
    public Ball() {
        super();
        Album album = new Album(this);
        album.addPageWithPicture("images/ball.png", "main");
        album.setPage("main");
        album.setMovementMode(MovementMode.BY_RECT);
        resizeByCenter(album.getCurrentPageWidth(), album.getCurrentPageHeight());
    }
    
    public void subUpdate(){
        
    }
    
    public boolean checkEndGameCondition() {
        if (getRect().getCornerX() < 0) {
            return true;
        }
        if (getRect().getCornerX() + getRect().getWidth() > GameMaster.getWidth()){
            return true;
        }
        return false;
    }
}
