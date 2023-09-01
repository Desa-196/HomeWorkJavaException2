//Дан следующий код, исправьте его там, где требуется

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 }; //Если присвоим null словим NullPointerException в следующей строке
            abc[1] = 9; //Если обратимся, например, ко 2-му элементу словим IndexOutOfBoundsException
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
        //Если добавим это: throw new FileNotFoundException(null); получим :  Что-то пошло не так...
    }
}
