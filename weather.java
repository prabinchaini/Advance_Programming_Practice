import java.util.Scanner;
class Temperature {

    double celsius;
    double fahrenheit;

    Temperature(double c) {
        celsius = c;
        fahrenheit = (celsius * 9 / 5) + 32; // Conversion formula
    }

    void Display() {
        System.out.println("Temperature in Celsius: " + celsius + "°C");
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
    }
}
public class weather {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        Temperature temp = new Temperature(celsius);
        temp.Display();
    }
}