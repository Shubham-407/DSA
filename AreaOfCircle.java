import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        float pi = 3.14f;

        float AreaOfCircle =(pi*(r*r));
        System.out.println(AreaOfCircle+" is area of circle");
    }
    
}
