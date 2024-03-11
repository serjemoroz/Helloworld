import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score;

        while (true) {
            System.out.print("Please enter your score: ");

            if (scanner.hasNextInt()) {
                score = scanner.nextInt();

                if (score >= 0 && score <= 100) {
                    break;
                } else {
                    System.out.println("Введено некорректное значение. Введите число от 0 до 100.");
                }
            } else {
                System.out.println("Введено некорректное значение. Введите число от 0 до 100.");
                scanner.next();  // Очистка буфера ввода
            }
        }
        if (score >= 70) {
            System.out.println("Конгратулатионс!");
        } else {
            System.out.println("Сорян.");
        }

        scanner.close();
    }
}
