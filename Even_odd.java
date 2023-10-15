import java.util.Scanner;

public class Even_odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is Even number");
        } else {
            System.out.println(a + " is Odd number");
        }
    }

}
