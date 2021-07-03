package basket;

import color.Color;
import exception.BasketException;

/**
 * Класс нужен для обработки данных корзины клсса {@link BasketEntity}
 */
public class BasketService {

    /**
     * Метод поиска количества синих шаров
     *
     * @param basket коллекция корзина с шарами
     *
     * @return int количество
     */
    public static int findNumberOfBlueBalls(BasketEntity basket){
        if(basket==null){
            return 0;
        }
        int numberOfBlueBalls=0;
        for(int i=0;i<basket.getBasket().size();i++) {
            if(basket.getBasket().get(i).getColor()== Color.BLUE){
                numberOfBlueBalls++;
            }
        }
        return numberOfBlueBalls;
    }

    /**
     * Подсчет веса корзины с шарами
     *
     * @param basket коллекция корзина с шарами
     *
     * @return double вес корзины
     */
    public static double calculateWeight(BasketEntity basket){
        if(basket==null){
            return 0;
        }
        double weight=0;
        for (int i=0;i<basket.getBasket().size();i++){
            if(basket.getBasket().get(i).getWeight()<0){
                basket.getBasket().get(i).setWeight(basket.getBasket().get(i).getWeight()*(-1));
            }
            weight+=basket.getBasket().get(i).getWeight();
        }
        return weight;
    }
}
