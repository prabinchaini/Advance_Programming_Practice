import java.util.Scanner;
class marks {

    int mark1, mark2, mark3;
    float average;
    int total;

    marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    void calculate() {
        total = mark1 + mark2 + mark3;
        average = total / 3;
    }
    void display() {
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
public class exam {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int m3 = sc.nextInt();
        marks m = new marks(m1, m2, m3);
        m.calculate();
        m.display();
    }
}
