java
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в формате a оператор b (например: 3 + 5):");

        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        if (parts.length != 3) {
            System.out.println("Ошибка: Неверный формат ввода. Убедитесь, что вы вводите выражение в формате 'a оператор b'.");
            return;
        }

        int a, b;
        String operator = parts[1];
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
            if (a < 1 || a > 10 || b < 1 || b > 10) {
                System.out.println("Ошибка: Числа должны быть в диапазоне от 1 до 10 включительно.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Вводимые значения должны быть целыми числами.");
            return;
        }

        switch (operator) {
            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + "  " + b + " = " + (a  b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Ошибка: Деление на ноль.");
                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            default:
                System.out.println("Ошибка: Неизвестный оператор. Используйте +, -, * или /.");
        }

        scanner.close();
    }
}