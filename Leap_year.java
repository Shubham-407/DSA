public class Leap_year {

    public static void main(String[] args) {
        int year = 2023;
               if ((year % 400 == 0) ||
               (year % 100 != 0) && 
               (year % 4 == 0)){
                System.out.println(year+" :Leap Year");
               }
               else{
                System.out.println(year+" :Not a leap year");
               }
    }
    
}
