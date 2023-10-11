import java.util.Scanner;

public class CurrancyConv {
    public void RupeesToDoller(int a,int amount){
        switch (a) {
            case 1:
            System.out.println(amount+" Rupees to doller "+(amount*0.013));
            break;
            case 2:
            System.out.println(amount+" Doller to Rupees "+(amount*80));
            default:
            System.out.println("INvalid input ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  1  for Rupees to Doller ");
        System.out.println("Enter  2  for Doller to Rupees ");
        int a = sc.nextInt();

        System.out.println("Enter amount");
        int amount = sc.nextInt();
       
        CurrancyConv cv = new CurrancyConv();
        cv.RupeesToDoller(a, amount);
    }
    
}
