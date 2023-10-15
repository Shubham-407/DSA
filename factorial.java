import java.util.Scanner;

public class factorial {

    static void factor(int num, int fact) {
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter factorial number");
        int num = sc.nextInt();
        int fact = 1;
        factor(num, fact);

    }

}
