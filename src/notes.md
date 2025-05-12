### Scanner

The Scanner class is used to get user input, and it is found in the java.util package.
```
    import java.util.Scanner;
```

#### How to use the Scanner class?

We need to create an object of the class and use any of the available methods.

##### Creating Scanner object
```
    Scanner myScanner = new Scanner(System.in);
```

> System.in is an **InputStream** that represents standard input (usually keyboard in a console application).
> It is part of the System class from java.lang package (which we can use without importing it).
> **new Scanner(System.in)** creates a new Scanner object that **can read input from the keyboard**.

#####  Calling Scanner's nextLine() method
```
    String userName = myScanner.nextLine();
```

##### In short

- System.in = keyboard input stream.
- Scanner needs it to know where to read input from.
- Together: new Scanner(System.in) means “create a tool to read from keyboard.”