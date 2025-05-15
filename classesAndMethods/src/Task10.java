import java.util.Scanner;

public class Task10 {
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 целых чисел (через пробел):");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();
        int result = lastNumSum(n1, n2);
        result = lastNumSum(result, n3);
        result = lastNumSum(result, n4);
        result = lastNumSum(result, n5);
        System.out.println("Результат: " + result);
    }
}
