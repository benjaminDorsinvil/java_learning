import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        boolean bool1 = true;
        System.out.println(bool1);
        int first = 76;
        int second = 87;

        if (first > second) {
            System.out.println("True");
        } else if (first == second) {
            System.out.println("They are equal");
        } else {
            System.out.println("false");
        }

        String firstString = "hello";
        String secondString = "hell1o";

        if (firstString.equals(secondString)) {
            System.out.println("They are equal");
        } else if (!firstString.equals(secondString)) {
            System.out.println("They are not equal");
        }

        boolean haveLicense = true;
        boolean haveInsurance = false;

        if (haveInsurance && haveLicense) {
            System.out.println("You are eligable to drive");
        } else if (haveInsurance && !haveLicense) {
            System.out.println("You need to fix your license");
        } else {
            System.out.println("You are not eligable to drive");
        }

        // learning switch
        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("The weather is sunny");
                break;
            case "cloud":
                System.out.println("The weather is cloudy");
                break;
            default:
                System.out.println("The weather is beautiful");
                break;
        }

        int role = 2;

        switch (role) {
            case 1:
                System.out.println("You are an admin");
                break;
            case 2:
                System.out.println("You are an editor");
                break;
            default:
                System.out.println("You are a User");
                break;
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Hey, are you free Friday!\nhmmm let me check my calender.\nIm available:");
        String dayAvailable = scan.nextLine();

        switch (dayAvailable) {
            case "Monday":
                System.out.println("Can't");
                break;
            case "Tuesday":
                System.out.println("Busy");
                break;
            case "Wednesday":
                System.out.println("Let's do it");
                break;
            default:
                System.out.println("Certainly");
        }
        scan.close();

    }
}
