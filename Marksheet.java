import java.util.Scanner;

public class Marksheet {
    static String marks(int marks) {

        if (marks <= 100 && marks >= 91) {
            return " Pass with grade AA";
        } else if (marks <= 90 && marks >= 81) {
            return " Pass with grade AB";
        } else if (marks <= 80 && marks >= 71) {
            return " Pass with grade BB";
        } else if (marks <= 70 && marks >= 61) {
            return " Pass with grade BC";
        } else if (marks <= 60 && marks >= 51) {
            return " Pass with grade CC";
        } else if (marks <= 50 && marks >= 41) {
            return "pass with grade DD";
        }
        return "fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks");
        int marks = sc.nextInt();

        String result = marks(marks);
        System.out.println(result);

    }

}
