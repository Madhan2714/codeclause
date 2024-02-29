import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        while (true) {
            System.out.print("Enter operation (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid operation. Please enter a valid option.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error! Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another operation? (yes/no): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                System.out.println("Exiting...");
                break;
            }
        }

        scanner.close();
    }
}
