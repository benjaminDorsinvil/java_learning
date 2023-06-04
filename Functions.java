import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        singChorus();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length = scan.nextDouble();
        System.out.println("Enter the width: ");
        double width = scan.nextDouble();
        double result = calculateArea(length, width);
        System.out.println("The result is equal to: " + result);
        scan.close();

    }

    public static void singChorus() {
        System.out.println("Don't blame it on the sunshine");
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
}
