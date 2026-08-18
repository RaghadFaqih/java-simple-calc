import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("================================");
        System.out.println(" Simple Java Console Calculator ");
        System.out.println("================================");

        while (continueCalculating) {
            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = divide(num1, num2);
                        System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator!");
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            char choice = scanner.next().toLowerCase().charAt(0);
            if (choice != 'y') {
                continueCalculating = false;
                System.out.println("\nThank you for using the calculator. Goodbye!");
            }
        }

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}