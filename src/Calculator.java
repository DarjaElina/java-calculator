import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🤖 Welcome to the Calculator!");

        while (true) {
            double firstNum;
            double secondNum;

            try {
                System.out.print("Enter the first number: ");
                firstNum = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                secondNum = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("❌ That wasn't a valid number.");
                scanner.nextLine(); // clear invalid input
                System.out.print("Would you like to try again? (y/n): ");
                String answer = scanner.next();
                if (!answer.equals("y")) {
                    System.out.println("Goodbye!");
                   break;
                }
                continue;
            }

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    if (secondNum != 0) {
                        result = firstNum / secondNum;
                    } else {
                        System.out.println("⚠️ Cannot divide by zero.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("❌ Invalid operator.");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.println("🤖 The result is: " + result);
            }

            System.out.println("Would you like to calculate again? (y/n): ");
            String tryAgain = scanner.next();
            if (!tryAgain.equalsIgnoreCase("y")) {
                System.out.println("Goodbye!");
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}