import java.util.Scanner;

public class Task9 {
    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число (c): ");
        int c = scanner.nextInt();
        boolean result = isEqual(a, b, c);
        System.out.println("Результат - все числа равны? " + result);
    }
}
