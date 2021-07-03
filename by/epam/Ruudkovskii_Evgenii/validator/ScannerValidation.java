package validator;

import java.util.Scanner;

/**
 * Класс нужен для упрощения работы со {@link Scanner}
 * В него входит ввод чисел типа int, double
 * Проверка введенного числа для типа double
 * Рассчитан для инициализации класса {@link ball.BallEntity}
 */
public class ScannerValidation {
    Scanner scanner=new Scanner(System.in);

    /**
     * Ввод целого числа типа int
     *
     * @return введенное пользователем число
     *
     * @exception InputMismatchException возникает при введении числа или символов не являющихся типом int
     */
    public int scanInt(){
        return scanner.nextInt();
    }

    /**
     * Ввод дробного положительного числа
     *
     * @return введенное пользователем число типа double
     *
     * @exception InputMismatchException возникает при введение числа или символов не являющихся типом double
     */
    public double scanPositiveDouble(){
        double outputNumber;
        while(true){
            outputNumber = scanner.nextDouble();
            if (outputNumber > 0) break;
        }
        return outputNumber;
    }
}
