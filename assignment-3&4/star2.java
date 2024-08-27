import java.util.Scanner;

public class star2 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((j%2 == 0)?"0":"1");
            }System.out.println();
        }

     }
}
