import java.util.*;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] arr=new int[rows][cols];
        int sum=0;

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]%2 != 0){
                    sum +=arr[i][j];
                }
            }
        }
        System.out.println("Sum of all odd numbers:"+sum);
    }    
}
