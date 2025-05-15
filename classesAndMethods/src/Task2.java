import java.util.Scanner;

public class Task2 {
    public static int sumLastNums(int x) {
        int lastDigit = x % 10;
        int secondLastDigit = (x / 10) % 10;
        return lastDigit + secondLastDigit;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число (не менее двух знаков): ");
        int x = scanner.nextInt();
        int result = sumLastNums(x);
        System.out.println("Сумма двух последних цифр: " + result);
    }
}
