package Ngay_3;

import java.util.Scanner;

public class bai_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter fahrenheit: ");
                fahrenheit = input.nextDouble();
                System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
            } else if (choice == 2) {
                System.out.println("Enter Celsius: ");
                celsius = input.nextDouble();
                System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
            } else if (choice == 0) {
                System.exit(0);
            }
        } while (true);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}

