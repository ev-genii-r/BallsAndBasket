package color;

/**
 * Перечисление определяет цвет типа Color
 * Также имеется возможность сгенерировать цвет по числу {@code findColor}
 */
public enum Color {
    RED,BLUE,YELLOW,PINK,BLACK,ORANGE,GREEN,PURPLE,BROWN,WHITE;

    /**
     * Нахождение цвета шарика по его номеру
     *
     * @param number число-номер цвета
     * При поступлении числа, для которого нет соответствующего цвета
     * Цвет устанавливается в значение WHITE
     *
     * @return элемент enum Color, который соответствует цвету шарика
     */
    public static Color findColor(int number){
        Color color;
        switch (number) {
            case 0:
                color= RED;
                break;
            case 1:
                color= BLUE;
                break;
            case 2:
                color= YELLOW;
                break;
            case 3:
                color= PINK;
                break;
            case 4:
                color= BLACK;
                break;
            case 5:
                color= ORANGE;
                break;
            case 6:
                color= GREEN;
                break;
            case 7:
                color= PURPLE;
                break;
            case 8:
                color= BROWN;
                break;
            default:
                color= WHITE;
        }
        return color;
    }
}
