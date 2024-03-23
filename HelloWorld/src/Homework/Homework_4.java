package Homework;

import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        while (true) {
            System.out.print("Please enter your score: ");
            if (scanner.hasNextInt()) {
                score = scanner.nextInt();
                if (score >= -100 && score <= 100) {
                    break;
                } else {
                    System.out.println("Введено некорректное значение. Введите число от 0 до 100.");
                }
            } else {
                System.out.println("Введено некорректное значение. Введите число от 0 до 100.");
                scanner.next();  // Очистка буфера
            }
        }

        int sum = 0;
        if (score < 0) {
            for (int i = 0; i >= score; i--) {
                sum+= i;
            }
        } else {
            for (int i = 0; i <= score; i++) {
                sum += i;
            }
        }

        System.out.println("The sum of all numbers from 0 to %d is %d”, x, sum");

        if (score >= 70) {
            System.out.println("Конгратулатионс!");
        } else {
            System.out.println("Сорян.");
        }
        scanner.close();
    }
}

