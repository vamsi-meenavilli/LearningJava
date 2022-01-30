import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double value1 = GetValue(input, "Enter Value1: ");
        double value2 = GetValue(input, "Enter Value2: ");
        char operation = GetOperation(input);
        double result = DoOperation(value1, value2, operation);
        System.out.printf("%.2f %c %.2f = %.2f%n", value1, operation, value2, result);
    }

    private static double GetValue(Scanner input, String prompt) {
        System.out.print(prompt);
        double value = 0.0;

        try {
            value = input.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter only numeric values.");
            System.exit(0);
        }

        return value;
    }

    private static char GetOperation(Scanner input) {
        System.out.print("Choose an operation[+, -, /, *]: ");
        char value= '\u0000';

        try {
            value = input.next().charAt(0);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return value;
    }

    private static double DoOperation(double value1, double value2, char operation) {
        double result = 0.0;

        switch (operation) {
            case '+' -> {
                try {
                    result = value1 + value2;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return result;
            }
            case '-' -> {
                try {
                    result = value1 - value2;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return result;
            }
            case '*' -> {
                try {
                    result = value1 * value2;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return result;
            }
            case '/' -> {
                try {
                    result = value1 / value2;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                return result;
            }
            default -> {
                System.out.println("Unknown Operation: " + operation);
                System.exit(0);
            }
        }

        return result;
    }
}
