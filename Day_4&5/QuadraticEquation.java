import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double determinant = b * b - 4 * a * c;
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            double root1 = (-b + sqrt) / (2 * a);
            double root2 = (-b - sqrt) / (2 * a);
            System.out.println("Roots are: " + root1 + " and " + root2);
        } else if (determinant == 0) {
            double root1 = -b / (2 * a);
            System.out.println("Root is: " + root1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}