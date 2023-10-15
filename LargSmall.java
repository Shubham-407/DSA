import java.util.Scanner;

public class LargSmall {
     

        public static int Largest(int a, int b, int c){
            int max = a;
            if(b > max){
                 max = b;
            }
            else if( c > max)
            {
                max = c;
            }
            return max;
        }

        public static int smallest(int a, int b, int c){
            int min = a;
            if(b < min)
            {
                min = b;

            }
            else if(c < min)
            {
                min = c;
            }
            return min;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        int largest = Largest(a,b,c);
        int smallest = smallest(a,b,c);

        System.out.println(largest+" this is largest number");
        System.out.println(smallest+" this is smallest number");

       
    }

    
}
