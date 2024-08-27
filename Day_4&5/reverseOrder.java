import java.util.Scanner;

public class reverseOrder {
    public static void main(String[] args) {
        int r, sum = 0, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = sc.nextInt();
        while (n > 0) {
            r = n % 10;
            // System.out.print(r);
            rev = (rev * 10) + r;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("Sum of digit:" + sum);
        System.out.println("Reverse of number:" + rev);
    }
}
