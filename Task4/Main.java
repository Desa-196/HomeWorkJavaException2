//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       System.out.println(readFromConsole());
    }

    public static String readFromConsole() throws RaedEmptyStringException {
        System.out.print("Введите текст: ");
        try (Scanner input = new Scanner(System.in)) {
            String result = input.nextLine();
            if(result.isEmpty()) throw new RaedEmptyStringException();
            return result;
        }
    }
}
