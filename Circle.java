import java.util.Scanner;

public class Circle {

    static float circumference(float r) {
        float circum = (2 * 3.14f) * r;
        return circum;
    }

    static float area(float r) {
        float area = 3.14f * r * r;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float r = sc.nextFloat();

        System.out.println(circumference(r)+" is circumference of circle");
        System.out.println(area(r)+" is area of circle");
    }

}
