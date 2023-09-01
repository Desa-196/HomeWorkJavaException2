public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[] { 4, 6, 2, 6, 8, 2, 6, 8, 4 };
        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за приделы размерности массива!");
        }
    }

}
