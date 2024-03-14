import java.util.Scanner;
//
//public class Homework_4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int score;
//
//        while (true) {
//            System.out.print("Please enter your score: ");
//
//            if (scanner.hasNextInt()) {
//                score = scanner.nextInt();
//
//                if (score >= 0 && score <= 100) {
//                    break;
//                } else {
//                    System.out.println("Введено некорректное значение. Введите число от 0 до 100.");
//                }
//            } else {
//                System.out.println("Введено некорректное значение. Введите число от 0 до 100.");
//                scanner.next();
//            }
//        }
//        if (score >= 70) {
//            System.out.println("Конгратулатионс!");
//        } else {
//            System.out.println("Сорян.");
//        }
//
//        scanner.close();
//    }
//}


//public class Homework_4 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//
//        while (true) {
//            System.out.print("Please enter something: ");
//            input = scanner.nextLine();
//
//
//            if (input.equals("Exit")) {
//                break;
//            }
//        }
//
//        System.out.println("Exiting the program.");
//
//        scanner.close();
//    }
//}

public class Homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();

        int sum = 0;

        if (x < 0) {
            System.out.println("You've entered a negative number. Please enter a non-negative integer.");
        } else {
            for (int i = 0; i <= x; i++) {
                sum += i;
            }
            System.out.printf("The sum of all numbers from 0 to %d is %d%n", x, sum);
        }

        scanner.close();
    }

}

