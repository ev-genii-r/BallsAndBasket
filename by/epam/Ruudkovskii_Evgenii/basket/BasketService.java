package basket;

import color.Color;

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
        double weight=0;
        for (int i=0;i<basket.getBasket().size();i++){
            weight+=basket.getBasket().get(i).getWeight();
        }
        return weight;
    }
}
