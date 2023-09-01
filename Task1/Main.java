/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Введенное число: %.2f", readFloatFromConsole());
    }

    // Функция ввода числа с проверкой
    public static float readFloatFromConsole() {
        System.out.print("Введите число: ");
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                try {
                    return input.nextFloat();
                } catch (InputMismatchException  e) {
                    System.out.println("Ошибка ввода, повторите ввод: ");
                    input.next();
                    continue;
                }
            }
        }
    }
}