import java.util.Scanner;

public class Task8 {
    public static boolean isDivisor(int a, int b) {
        return (a != 0 && b % a == 0) || (b != 0 && a % b == 0);
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();
        boolean result = isDivisor(a, b);
        System.out.println("Результат - одно число делит другое нацело? " + result);
    }
}
