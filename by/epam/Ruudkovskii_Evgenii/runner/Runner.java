package runner;

import ball.BallEntity;
import basket.BasketEntity;
import basket.BasketService;
import exception.BallWeightException;
import exception.BasketException;
import validator.ScannerValidation;

public class Runner {
    public static void main(String[] args){

        int inputColor;
        int inputAddBall;
        double inputWeight;
        ScannerValidation scanner=new ScannerValidation();
        BasketEntity basket=new BasketEntity();

        while(true){
            System.out.println("Do you want to add new ball?\n 1-yes 0-no");
            inputAddBall=scanner.scanInt();
            if(inputAddBall!=1){
                break;
            }
            BallEntity ball=new BallEntity();

            System.out.println("Input color of ball\n0-red\n1-blue\n2-yellow\n3-pink\n4-black\n5-orange\n6-green\n7-purple\n8-brown\n9-white");
            inputColor=scanner.scanInt();
            ball.setColor(inputColor);

            System.out.println("Input ball's weight");
            inputWeight=scanner.scanPositiveDouble();
            ball.setWeight(inputWeight);
            basket.addBall(ball);
        }
        for (int i=0;i<basket.getBasket().size();i++){
            System.out.println(basket.getBasket().get(i).toString());
        }

        System.out.println("====================");
        int numberOfBlueBalls = BasketService.findNumberOfBlueBalls(basket);
        double basketWeight = BasketService.calculateWeight(basket);

        System.out.println("Number of blue balls= "+ numberOfBlueBalls);
        System.out.println("Basket weight= "+basketWeight);
    }
}
