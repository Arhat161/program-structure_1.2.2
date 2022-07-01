import java.util.Scanner;

class Main {

    public static final double PI = 3.14;

    public static double calculateCircleArea(int radius) {
        return PI * radius * radius;
    }

    public static double calculateCircleLenght(int radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle in centimeters:");
        int radius = scanner.nextInt();

        double area = calculateCircleArea(radius);
        double length = calculateCircleLenght(radius);

        System.out.println("Area of a circle: " + area + " centimeter square.");
        System.out.println("Perimeter of a circle: " + length + " centimeter.");
    }
}