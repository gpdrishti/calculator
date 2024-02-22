package calculator;

import java.util;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Calculator!");
        System.out.println("1. Power");
        System.out.println("2. Natural Logarithm");
        System.out.println("3. Square Root");
        System.out.println("4. Factorial");
        System.out.print("Choose an operation (1/2/3/4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + power(base, exponent));
                break;
            case 2:
                System.out.print("Enter number: ");
                double num = scanner.nextDouble();
                System.out.println("Result: " + naturalLog(num));
                break;
            case 3:
                System.out.print("Enter number: ");
                double number = scanner.nextDouble();
                System.out.println("Result: " + squareRoot(number));
                break;
            case 4:
                System.out.print("Enter number: ");
                int n = scanner.nextInt();
                System.out.println("Result: " + factorial(n));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    // Method to calculate power
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Method to calculate natural logarithm
    public static double naturalLog(double num) {
        return Math.log(num);
    }

    // Method to calculate square root
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
			
