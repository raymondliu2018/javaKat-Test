package workspace;
import javaKat.*;

public class Border extends Entity{
    public Border() {
        super();
        rect.setSize(GameMaster.getWidth(), 10);
        rect.setCornerX(0.0);
    }
    public void subUpdate() {
        
    }
    public Reaction collidedWith(Entity input) {
        if (input instanceof Paddle) {
            return Reaction.REFLECT;
        }
        if (input instanceof Ball) {
            return Reaction.REFLECT;
        }
        return Reaction.AGREE;
    }
}
