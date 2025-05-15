import java.util.Scanner;

public class Task6 {
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ от 'a'/'A' до 'z'/'Z': ");
        String input = scanner.nextLine();
        if (input.length() == 3 && input.charAt(0) == '\'' && input.charAt(2) == '\'') {
            char x = input.charAt(1);
            boolean result = isUpperCase(x);
            System.out.println("Результат - это заглавная буква? " + result);
        } else {
            System.out.println("Ошибка: введите символ в формате 'X'.");
        }
    }
}
