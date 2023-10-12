import java.util.Scanner;

public class largestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int larg = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number untile you enter zero");
            int a = sc.nextInt();

            if (a == 0) {
                break;
            }

            if (a > larg) {
                larg = a;
            }

        }
        
        if (larg != Integer.MIN_VALUE) 
        {
            System.out.println("Largest Number is : " + larg);
        } 
        else 
        {
            System.out.println("You have not entered any numbers.");
        }
    }

}
