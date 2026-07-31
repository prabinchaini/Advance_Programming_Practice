
import java.util.Scanner;


class rectangle {

    float length, breadth;
    double area;

    rectangle(float l, float b, double a) {
        length = l;
        breadth = b;
        area = a;
    }

    void Calculate() {
        area = length * breadth;
    }

    void Display() {
        System.out.println("Area of rectangle is: " + area);
    }
}

public class designer {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter breadth of the rectangle: ");
        float breadth = sc.nextFloat();
        rectangle r = new rectangle(length, breadth, 0.0);  
        r.Calculate();
        r.Display();
    }
}
