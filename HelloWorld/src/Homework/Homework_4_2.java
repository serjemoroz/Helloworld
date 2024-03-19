package Homework;

import java.util.Scanner;

public class Homework_4_2 {
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
