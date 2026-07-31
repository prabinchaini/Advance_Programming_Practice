
class employee {

    String name;
    double salary;

    employee(String n, double s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name of the employee is: " + name);
        System.out.println("Salary of the employee is: $" + salary);
    }
}

public class company {

    public static void main(String[] args) {
        employee e1 = new employee("Prabin", 5000);
        employee e2 = new employee("Hira", 6000);

        e1.display();
        e2.display();
    }
}
