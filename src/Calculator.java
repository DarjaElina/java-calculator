import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🤖 Welcome to the Calculator!");
        System.out.println("Please enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Please enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result = 0;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("⚠️ Cannot divide by zero.");
                    return;
                }
                break;
        }

        // enhanced but difficult version
//        double result = switch (operator) {
//            case '+' -> firstNumber + secondNumber;
//            case '-' -> firstNumber - secondNumber;
//            case '*' -> firstNumber * secondNumber;
//            case '/' -> firstNumber / secondNumber;
//            default -> 0;
//        };
        System.out.println("🤖 The result is: " + result);
    }
}
