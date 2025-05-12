import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        // creating new scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        String number = scanner.nextLine();
        System.out.println("Your number is: " + number);
    }
}
