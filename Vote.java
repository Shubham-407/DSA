import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of voter");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("Sorry, you are not eligible to vote yet.");
        }
    }
    
}
