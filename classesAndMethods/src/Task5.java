import java.util.Scanner;

public class Task5 {
    public static boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int x = scanner.nextInt();
        if (x <= 0) {
            System.out.println("Ошибка: число должно быть положительным.");
            return;
        }
        boolean result = is2Digits(x);
        System.out.println("Результат - число двузначное? " + result);
    }
}
