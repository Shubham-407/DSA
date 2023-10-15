import java.util.Scanner;

public class rangePrime {

    static void prime(int first, int last) {
        int flag;
        for (int i = first; i <= last; i++) {

            if (i == 1 || i == 0)
                continue;

            flag = 1;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int last = sc.nextInt();

        prime(first, last);

    }

}
