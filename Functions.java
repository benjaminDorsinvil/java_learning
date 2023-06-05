import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        /**
         * this function call the singChorus function
         */
        singChorus();
        // asking the user for width and length
        double width = width();
        double length = length();

        double result = calculateArea(length, width);
        System.out.println("The result is equal to: " + result);

        // caltulating the tips
        int bill = 100;
        double tip = tipTheWaiter(bill);
        System.out.println(tip);

    }

    public static double length() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length = scan.nextDouble();
        scan.close();
        return length;

    }

    public static double width() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scan.nextDouble();
        scan.close();
        return width;

    }

    public static void singChorus() {
        System.out.println("Don't blame it on the sunshine");
    }

    /**
     * Function name: calculateArea
     * 
     * @param length (double)
     * @param width  (double)
     * @return (double)
     *         Inside the function:
     *         1. determing if length or width are null
     *         2. return the area
     * 
     */
    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVALID DIMENTIONS");
            System.exit(0);
        }
        return length * width;

    }

    public static double tipTheWaiter(double bill) {
        double tip = bill * 0.15;
        return tip;

    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equal length * width";
            default:
                return "No languange";
        }

    }
}
