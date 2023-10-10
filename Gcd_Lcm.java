public class Gcd_Lcm {
    public static void main(String[] args) {
        int n = 12;
        int m = 36;

        int n1 = n;
        int m1 = m;

        while(n%m !=0){
            int rem = n%m;
            n = m;
            m = rem;
        }
        int gcd = m;
        int lcm = (n1 * m1)/gcd;
        System.out.println("GCD : " + gcd);
        System.out.println("LCM : " + lcm);

    }
    
}
