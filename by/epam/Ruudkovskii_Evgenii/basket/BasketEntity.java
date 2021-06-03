package basket;

import ball.BallEntity;
import java.util.ArrayList;

/**
 * Класс корзина наполняется объектами типа {@link BallEntity}
 * Представляет собой коллекцию типа {@link ArrayList}
 */
public class BasketEntity {
    private ArrayList list=new ArrayList();

    /**
     * Добавление шарика в корзину
     *
     * @param ball объект класса {@link BallEntity}
     */
    public void addBall(BallEntity ball){
        list.add(ball);
    }

    /**
     * Возвращает коллекцию
     *
     * @return list -- коллекция {@link ArrayList}
     */
    public ArrayList<BallEntity> getBasket(){
        return list;
    }
}
