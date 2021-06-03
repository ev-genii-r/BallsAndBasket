package ball;

import color.Color;
import java.util.Objects;

/**
 * Класс представляет собой сущность мячика со следующими полями:
 * цвет color типа перечисления Color {@link Color}
 * вес weight типа double
 */
public class BallEntity {
    private Color color;
    private double weight;

    public BallEntity(){}

    public void setColor(int colorNumber){
        this.color=Color.findColor(colorNumber);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public Color getColor() {
        return color;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallEntity that = (BallEntity) o;
        return Double.compare(that.weight, weight) == 0 && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    /**
     * Вывод всей информации о классе в виде строки
     *
     * @return строка типа "Ball weight: 1.23 color: WHITE"
     */
   @Override
    public String toString(){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("Ball weight: "+weight+" color: "+color);
        return stringBuffer.toString();
   }
}
