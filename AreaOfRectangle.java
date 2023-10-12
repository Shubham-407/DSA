import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of rectangle");
        int l = sc.nextInt();
        System.out.println("Enter the width of rectangle");
        int w = sc.nextInt();

        int area = l * w;
        System.out.println(area);
    }

}
