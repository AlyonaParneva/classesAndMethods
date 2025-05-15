import java.util.Scanner;

public class Task7 {
    public static boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите границу a: ");
        int a = scanner.nextInt();
        System.out.print("Введите границу b: ");
        int b = scanner.nextInt();
        System.out.print("Введите число для проверки: ");
        int num = scanner.nextInt();
        boolean result = isInRange(a, b, num);
        System.out.println("Результат - число входит в диапазон? " + result);
    }
}
