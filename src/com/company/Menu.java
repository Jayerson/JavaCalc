package com.company;
import java.util.Scanner;

public class Menu {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        double first = input.nextDouble();
        System.out.println("Please enter the operator: +, -, *, /, ^ for power index, # for square root");
        char operator = input.next().charAt(0);
        if (operator == '#') {
            Sqrt out = new Sqrt(first);
        }
        if (operator != '#') {
            System.out.println("Please enter the second number:");
            double second = input.nextDouble();
            if (operator == '+') {
                new Add(first, second);
            } else if (operator == '-') {
                new Subtract(first, second);
            } else if (operator == '*') {
                new Multiply(first, second);
            } else if (operator == '/') {
                new Divide(first, second);
            } else if (operator == '^') {
                new Power(first, second);
            } else {
                System.out.println("Check your inputs");
            }
        }
    }
}
