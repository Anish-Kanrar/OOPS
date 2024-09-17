import java.util.*;
abstract class Accounts {
    int acno; String acname; String mob; int balance = 0;
    abstract void withdrawal(int a);
    abstract void deposit(int b);
    abstract void display(int c);
}
class SavingsAccount extends Accounts {
    SavingsAccount(int n, String an, String m) {
        acno = n; acname = an; mob = m;
    }
    void withdrawal(int a) {
        if (balance <= 0) {
            System.out.println("You have not enough balance!");
        } 
else {
            if (balance > a) {
                balance -= a; display(balance);
            } 
 else {
                System.out.println("This is not a valid    amount....");
            }
        }
    }
    void deposit(int b) {
        balance += b; display(balance);
    }

    void display(int b) {
        System.out.println("A/c no: " + acno);
        System.out.println("Name: " + acname);
        System.out.println("Mobile No: " + mob);
        System.out.println("Balance: " + balance);
    }
}

public class p3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int a = sc.nextInt();
        System.out.println("Enter account name: ");
        String n = sc.next();
        System.out.println("Enter mobile no: ");
        String m = sc.next();
        SavingsAccount s1 = new SavingsAccount(a, n, m);
        System.out.println("Enter amount to deposit: ");
        int da = sc.nextInt();
        System.out.println();
        s1.deposit(da); System.out.println();
        System.out.println("Enter amount to withdraw: ");
        int wa = sc.nextInt();
        System.out.println();
        s1.withdrawal(wa);
    }
}
