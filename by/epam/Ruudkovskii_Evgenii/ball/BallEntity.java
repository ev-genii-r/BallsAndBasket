package ball;

public class BallEntity {
    private String color;
    private double weight;


    public void setColor(int colorNumber){
        String resultColor;
        switch (colorNumber){
            case 0: resultColor="red";break;
            case 1: resultColor="blue";break;
            case 2: resultColor="yellow";break;
            case 3: resultColor="pink";break;
            case 4: resultColor="black";break;
            case 5: resultColor="orange";break;
            case 6: resultColor="green";break;
            case 7: resultColor="purple";break;
            case 8: resultColor="brown";break;
            default: resultColor="white";break;
        }
        this.color = resultColor;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public String getColor() {
        return color;
    }
    public double getWeight() {
        return weight;
    }
}
