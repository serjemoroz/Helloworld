import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сергей Мороз, 30 лет, QA Engineer");

        int number = 42;
        double pi = 3.14;
        String Name = "Sergey";
        boolean isQA = true;

        System.out.println("\nЗначения переменных:");
        System.out.println("Целое число: " + number);
        System.out.println("Дробное число: " + pi);
        System.out.println("Строка: " + Name);
        System.out.println("Логическое значение: " + isQA);

        System.out.println("\nВведи произвольный текст: ");
        String userInput = scanner.nextLine();

        System.out.println("\nРезультаты работы с введенной строкой:");
        System.out.println("Длина строки: " + userInput.length());
        System.out.println("Приведение к верхнему регистру: " + userInput.toUpperCase());
        System.out.println("Приведение к нижнему регистру: " + userInput.toLowerCase());
        System.out.println("Замена символов: " + userInput.replace('a', 'X'));

        scanner.close();
    }
}

