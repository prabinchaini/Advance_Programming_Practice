
class student {

    String name;
    int age;

    student(String n, int a) {
        name = n;
        age = a;

    }

    void Display() {
        System.out.println("Name of the student is: " + name);
        System.out.println("Age of the student is: " + age);
    }

}

public class records {

    public static void main(String[] args) {
        student s1 = new student("John", 20);
        student s2 = new student("Alice", 22);

        s1.Display();
        s2.Display();
    }
}
