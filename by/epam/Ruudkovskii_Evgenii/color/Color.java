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
        switch (number) {
            case 0:
                return RED;
            case 1:
                return BLUE;
            case 2:
                return YELLOW;
            case 3:
                return PINK;
            case 4:
                return BLACK;
            case 5:
                return ORANGE;
            case 6:
                return GREEN;
            case 7:
                return PURPLE;
            case 8:
                return BROWN;
            default:
                return WHITE;
        }
    }
}
