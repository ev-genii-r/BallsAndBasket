package basket;

import ball.BallEntity;

import java.util.ArrayList;

public class BasketEntity {
    private ArrayList list=new ArrayList();

    public void addBall(BallEntity ball){
        list.add(ball);
    }

    public ArrayList<BallEntity> getBasket(){
        return list;
    }
}
