
class students {

    String Name;
    int rollNo;

    students(String n, int r) {
        Name = n;
        rollNo = r;

    }

    void Display() {
        System.out.println("Name: " + Name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class collage {

    public static void main(String[] args) {
        students s = new students("Prabin", 60);
        s.Display();
    }
}
