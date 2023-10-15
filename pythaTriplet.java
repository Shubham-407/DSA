import java.util.Scanner;

public class pythaTriplet {

    static void triplet(int l, int b, int h){
        int length = l*l;
        int breath = b*b;
        int height = h*h;

        int sq = length+breath;

        if(sq == height){
            System.out.println("The given values form a Pythagorean Triplet");
        }else{
            System.out.println("This is not pythagorean Triplet");   
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int l = sc.nextInt();
        System.out.println("Enter breath");
        int b = sc.nextInt();
        System.out.println("Enter height");
        int h = sc.nextInt();

        triplet(l, b, h);

    }
    
}
