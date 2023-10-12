import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter consumption of power (kWh)");
        int consumption = sc.nextInt();

        System.out.println("Enter rate in (kWh)");
        int rate = sc.nextInt();

        System.out.println(consumption * rate +" your electricity bill");

    }

}
