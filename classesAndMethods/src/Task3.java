import java.util.Scanner;

public class Task3 {
    public static int charToNum(char x) {
        return x - 48;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифру от 0 до 9 (в виде символа): ");
        String input = scanner.nextLine();

        if (input.length() == 3 && input.charAt(0) == '\'' && input.charAt(2) == '\'') {
            char x = input.charAt(1);
            if (x >= '0' && x <= '9') {
                int result = charToNum(x);
                System.out.println("Результат: " + result);
            } else {
                System.out.println("Ошибка: введите символ от '0' до '9'.");
            }
        }
    }
}
