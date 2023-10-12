import java.util.Scanner;

public class AreaOfIsoscelesTria {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter base length of triangle");
        float b = in.nextFloat();
        System.out.println("Enter heigth of triangle");
        float h = in.nextFloat();

        float result = 0.5f*b*h;

        System.out.println(result+" this is area of isosceles triangle");


    }
    
}
