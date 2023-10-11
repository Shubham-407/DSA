import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base of triangle");
        int b = sc.nextInt();
        System.out.println("Enter height of triangle");
        int h = sc.nextInt();

        System.out.println("Area of Triangle is: "+(b*h)/2);
    }
    
}
