package components;

import java.util.Scanner;

import interfaces.Calculator;

public class BasicCalculator implements Calculator {
    protected double num1;
    protected double num2;
    protected char operator;
    protected double result;

    public BasicCalculator getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        scanner.close();
        return this;
    }

    public BasicCalculator calculate() {
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                break;
        }
        return this;
    }

    public void getResult() {
        System.out.println("Result: " + result);

    }
}
