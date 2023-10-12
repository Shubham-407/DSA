import java.util.Scanner;

public class sumOfN_no {
    // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number until you enter zero program take input");
        int a = sc.nextInt();
        int sum =0;

        while(a>0){
            sum = sum +a;
            int temp = sc.nextInt();
            a = temp;
        }
        System.out.println("sum of all number is "+sum );
        

    }
    
}
