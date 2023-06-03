public class Lessons {
    public static void main(String[] args) {
        long number = 98_989_843_434_343L;
        System.out.println("There are this " + number + " many google source ");

        double height = 7.87;
        System.out.println("My height is " + height + " inches");

        double wallet = 20; // always use doube for math calculation.
        int people = 3;
        System.out.println(wallet / people);

        // calling the casting method
        casting();
        // calling the shipping method
        shipping();
    }

    public static void casting() {
        int ants = 2000;
        int purchasedBlockOfCheese = 1;
        System.out.println("There are " + ants + " ants, and " + (double) purchasedBlockOfCheese + " block of cheese.");
        double salary = 5423.95;
        int roundedSalary = (int) salary;

        System.out.println("Mortgate broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: $" + roundedSalary);

    }

    public static void shipping() {
        double shipping = 1233.57;
        int finalShipping = (int) shipping;
        System.out.println(finalShipping);

    }

}
