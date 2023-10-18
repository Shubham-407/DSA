

public class Student {
    String name;
    int roll_no;
    int sub1, sub2, sub3;
    int total;

    Student() {

    }

    public Student(String string, int r, int s1, int s2, int s3, int t) {
        this.name = string;
        this.roll_no = r;
        this.sub1 = s1;
        this.sub2 = s2;
        this.sub3 = s3;
        this.total = t;
    }

    public void displaystudent() {
        System.out.println("Student Name:" + name);
        System.out.println("Student Roll_no:" + roll_no);
        System.out.println("Mark in Subject1:" + sub1);
        System.out.println("Mark in Subject2:" + sub2);
        System.out.println("Mark in Subject3:" + sub3);
    }
}

class Marks extends Student {
    int total;
    double per;

    public Marks(String name, int r, int s1, int s2, int s3, int t) {
        super(name, r, s1, s2, s3, t);
    }

    public int getTotal() {
        total = sub1 + sub2 + sub3;
        System.out.println("the total mark of student" + total);
        return total;
    }
}

class Sports extends Marks {
    int sportmark;

    public Sports(String name, int r, int s1, int s2, int s3, int t, int sm) {
        super(name, r, s1, s2, s3, t);
        this.sportmark = sm;
    }

    public void getResult() {
        int finaltotal = getTotal() + sportmark;
        displaystudent();
        double per = finaltotal / 5.0;
        System.out.println("Total obtained:" + finaltotal);
        System.out.println("Percentage obtained: " + per + "%");
    }

    public static void main(String args[]) {
        Sports sp = new Sports("krutika", 54, 65, 35, 100, 60, 90);
        sp.getResult();
    }
}
