package basket;

public class BasketLogic {

    public static int findNumberOfBlueBalls(BasketEntity basket){
        int numberOfBlueBalls=0;
        for(int i=0;i<basket.getBasket().size();i++) {
            if(basket.getBasket().get(i).getColor()=="blue"){
                numberOfBlueBalls++;
            }
        }
        return numberOfBlueBalls;
    }

    public static double calculateWeight(BasketEntity basket){
        double weight=0;
        for (int i=0;i<basket.getBasket().size();i++){
            weight+=basket.getBasket().get(i).getWeight();
        }
        return weight;
    }
}
