- **Scanner** is a built-in Java class that allows us to process user input.

- We can read input from the **keyboard**, a **file**, or a **string** using Scanner.

- To use Scanner, we import it like this:
import java.util.Scanner;

- We create a Scanner object like this:
Scanner scanner = new Scanner(System.in);

- System is a built-in Java class. We use the **in** property to get input from the keyboard (typical for console apps).

- Common Scanner methods:
  - scanner.next() – reads the next word/token (until space)
  - scanner.nextLine() – reads an entire line of text
  - scanner.nextDouble() – reads a double (floating-point number)
  - scanner.next().charAt(0) – gets the first character of a string (useful for options like 'y' or 'n')
  - scanner.close() – closes the scanner (recommended when done)

- The equalsIgnoreCase() method is used for case-insensitive string comparison.

- InputMismatchException is used to catch and handle situations where we expect one type of input but get another (e.g., a letter instead of a number).

- It lives in the package: java.util.InputMismatchException.