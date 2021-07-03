import ball.BallEntity;
import basket.BasketEntity;
import basket.BasketService;
import color.Color;
import org.junit.Assert;
import org.junit.Test;

public class BasketServiceTest {
    @Test
    public void nullTestFindNumberOfBlueBalls(){
        int actual = BasketService.findNumberOfBlueBalls(null);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nullTestCalculateWeight(){
        double actual = BasketService.calculateWeight(null);
        double expected = 0;
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void actualTestFindNumberOfBlueBalls(){
        BallEntity ballEntity1=new BallEntity(Color.RED, 0.2);
        BallEntity ballEntity2=new BallEntity(Color.BLUE, 0.6);
        BasketEntity basketEntity=new BasketEntity();
        basketEntity.addBall(ballEntity1);
        basketEntity.addBall(ballEntity2);
        int actual = BasketService.findNumberOfBlueBalls(basketEntity);
        int expected = 1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void actualTestCalculateWeight(){
        BallEntity ballEntity1=new BallEntity(Color.RED, 0.2);
        BallEntity ballEntity2=new BallEntity(Color.BLUE, 0.6);
        BasketEntity basketEntity=new BasketEntity();
        basketEntity.addBall(ballEntity1);
        basketEntity.addBall(ballEntity2);
        double actual = BasketService.calculateWeight(basketEntity);
        double expected = 0.8;
        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void negativeTestCalculateWeight(){
        BallEntity ballEntity1=new BallEntity(Color.RED, -0.2);
        BallEntity ballEntity2=new BallEntity(Color.BLUE, -0.6);
        BasketEntity basketEntity=new BasketEntity();
        basketEntity.addBall(ballEntity1);
        basketEntity.addBall(ballEntity2);
        double actual = BasketService.calculateWeight(basketEntity);
        double expected = 0.8;
        Assert.assertEquals(expected, actual, 0.0001);
    }
}
