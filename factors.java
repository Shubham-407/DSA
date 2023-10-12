import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorials");
        int fct = sc.nextInt();

        for(int i = 1; i<=fct; i++){
            if( fct % i == 0){
                System.out.println(i+" factors of "+fct);
            }
        }
    }
    
}
