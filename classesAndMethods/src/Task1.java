import java.util.Scanner;

public class Task1 {
    public static double fraction(double x) {
        double fractional = x - (int) x;
        return Math.round(fractional * 1000.0) / 1000.0;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String input = scanner.nextLine();
        double x = Double.parseDouble(input);
        double result = fraction(x);
        System.out.println("Дробная часть: " + result);
    }
}
