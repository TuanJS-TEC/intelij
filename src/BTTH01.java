import java.util.Scanner;

public class BTTH01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two real numbers a and b
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        solveEquation(a, b);
    }

    public static void solveEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("VSN");  // Infinite solutions
            } else {
                System.out.println("VN");   // No solution
            }
        } else {
            // Unique solution exists
            double solution = -b / a;
            System.out.printf("%.2f\n", solution);  // Print with 2 decimal places
        }
    }
}
