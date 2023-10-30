public class check_prime {
    static boolean isPrime(int n) {
        int i = 0;

        //logic
        if (n < 1) {  // this is used for 1 number is not prime 
            return false;
        }
        for (i = 2; i < n; i++) {  // to check whether number is prime or not
            if (n % i == 0) {
                break;  // using break if value of n and i is reminder is zero
            }
        }
        if (i == n) {  // if calue of i and n is equal then print
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 2;

        boolean result= isPrime(n);

        System.out.println();

        if (isPrime(n)) {
            System.out.println("The number " + n + " is prime");
        } else {
            System.out.println("The number " + n + " is not - prime");
        }

    }
}
