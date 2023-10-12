import java.util.Scanner;

public class sumOfDigit {
    // Subtract the Product and Sum of Digits of an Integer
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int product = 1;
        int sumOfDigit = 0;
        
        while(num>0){
            int digit = num % 10;
            product = product*digit;
            sumOfDigit += digit;
            num = num/10;

        }
        int result = product - sumOfDigit;

        System.out.println(result);
    }
    
}
