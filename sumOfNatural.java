import java.util.Scanner;

public class sumOfNatural {
    static int sum_natural(int n){
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum = sum +i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        int result_sum = sum_natural(n);

        System.out.println(result_sum);
    }
    
}
