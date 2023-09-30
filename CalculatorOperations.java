import java.util.Scanner;

public class CalculatorOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Calculator!");

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power of");
            System.out.println("6. Square Root");
            System.out.println("7. Logarithm");
            System.out.println("8. Natural Logarithm (ln)");
            System.out.println("9. Sine");
            System.out.println("10. Cosine");
            System.out.println("11. Tangent");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            double result = 0;

            if (choice == 0) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter first number:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number:");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Enter base:");
                double base = scanner.nextDouble();
                System.out.println("Enter exponent:");
                double exponent = scanner.nextDouble();
                result = power(base, exponent);
            } else if (choice == 6) {
                System.out.println("Enter number:");
                double number = scanner.nextDouble();
                result = squareRoot(number);
            } else if (choice == 7) {
                System.out.println("Enter number:");
                double number = scanner.nextDouble();
                result = logarithm(number);
            } else if (choice == 8) {
                System.out.println("Enter number:");
                double number = scanner.nextDouble();
                result = naturalLogarithm(number);
            } else if (choice >= 9 && choice <= 11) {
                System.out.println("Enter angle in degrees:");
                double angle = scanner.nextDouble();
                switch (choice) {
                    case 9:
                        result = sine(angle);
                        break;
                    case 10:
                        result = cosine(angle);
                        break;
                    case 11:
                        result = tangent(angle);
                        break;
                }
            }

            System.out.println("Result: " + result);
        }
        scanner.close();
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    private static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    private static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    private static double logarithm(double number) {
        return Math.log10(number);
    }

    private static double naturalLogarithm(double number) {
        return Math.log(number);
    }

    private static double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    private static double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    private static double tangent(double angle) {
        return Math.tan(Math.toRadians(angle));
    }
}


