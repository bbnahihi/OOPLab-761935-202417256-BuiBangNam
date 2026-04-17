import java.util.Scanner;

public class EquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("1. First-degree equation with one variable (ax + b = 0)");
            System.out.println("2. System of first-degree equations with two variables");
            System.out.println("3. Second-degree equation with one variable (ax^2 + bx + c = 0)");
            System.out.println("0. Exit");
            System.out.print("Please select an option (0-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation(scanner);
                    break;
                case 2:
                    solveLinearSystem(scanner);
                    break;
                case 3:
                    solveQuadraticEquation(scanner);
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
    private static void solveLinearEquation(Scanner scanner) {
        System.out.println("\n--- First-degree equation: ax + b = 0 ---");
        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("The solution is: x = " + x);
        }
    }

    private static void solveLinearSystem(Scanner scanner) {
        System.out.println("\n--- Linear system with two variables ---");
        System.out.println("Format: a11*x1 + a12*x2 = b1");
        System.out.println("        a21*x1 + a22*x2 = b2");
        
        System.out.print("Input a11: "); double a11 = scanner.nextDouble();
        System.out.print("Input a12: "); double a12 = scanner.nextDouble();
        System.out.print("Input b1: ");  double b1 = scanner.nextDouble();
        System.out.print("Input a21: "); double a21 = scanner.nextDouble();
        System.out.print("Input a22: "); double a22 = scanner.nextDouble();
        System.out.print("Input b2: ");  double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("The system has a unique solution:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        }
    }

    private static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("\n--- Second-degree equation: ax^2 + bx + c = 0 ---");
        System.out.print("Input a: "); double a = scanner.nextDouble();
        System.out.print("Input b: "); double b = scanner.nextDouble();
        System.out.print("Input c: "); double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Since a = 0, this becomes a linear equation (bx + c = 0).");
            if (b == 0) {
                if (c == 0) {
                    System.out.println("The equation has infinitely many solutions.");
                } else {
                    System.out.println("The equation has no solution.");
                }
            } else {
                double x = -c / b;
                System.out.println("The solution is: x = " + x);
            }
        } else {
            // Tính Delta theo Hint
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct real roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has a double root:");
                System.out.println("x = " + x);
            } else {
                System.out.println("The equation has no real root.");
            }
        }
    }
}