import java.util.Scanner;

public class Task4 {
    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int x = scanner.nextInt();
        boolean result = isPositive(x);
        System.out.println("Результат - положительное число?  " + result);
    }
}
