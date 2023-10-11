import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first digit");
        int a = sc.nextInt();

        System.out.println("Enter + or - or * or /");
        String str = sc.next();

        System.out.println("Enter second digit");
        int b = sc.nextInt();

        if(str.equals("+")){
            System.out.println("Sum of two number is: "+(a+b));
        }else if(str.equals("-")){
            System.out.println("Subtraction of two numbers is :"+ (a-b));
        }else if(str.equals("*")){
            System.out.println("Multiplication of two number is: "+(a*b));
        }else if(str.equals("/")){
            System.out.println("Divion of two nuumber is: "+(a/b));
        }else{
            System.out.println("Invalid value Enter!");
        }
    }
    
}
