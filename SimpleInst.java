import java.util.Scanner;

public class SimpleInst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        int p = sc.nextInt();
        System.out.println("Enter Interest_rate: ");
        int r = sc.nextInt();
        System.out.println("Enter Time period: ");
        int t = sc.nextInt();
        

        int SimpleInsterest = (p*r*t)/100;
        System.out.println("The simple interest is :" +SimpleInsterest );
    }
    
}
