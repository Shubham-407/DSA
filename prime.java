import java.util.Scanner;

public class prime {
    static boolean isPrime(int n){
        int count = 0;
        if(n == 1){
            return false;
        }
        for(int i = 2; i<=n; i++){
            if(n % i == 0){
                count = i;
                break;
            }
        }
        if(n == count){
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int n = sc.nextInt();
        boolean prime = isPrime(n);

        if(prime){
            System.out.println(n+" is prime number");
        }else{
            System.out.println(n+" is not prime number");
        }
    }
    
}
