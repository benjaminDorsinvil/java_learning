public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples += 500;

        System.out.println("Time for buisness! You're selling each apple for 40 cents");

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples = numOfApples - 4;
        numOfCustomers += 1;
        profit = numOfApples * 0.40;

        System.out.println("Another customer walked in. He bought 20 apples");
        numOfApples = numOfApples - 20;
        numOfCustomers += 1;
        profit = numOfApples * 0.40;

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples = numOfApples - 200;
        numOfCustomers += 1;
        profit = (500 - numOfApples) * 0.40;

        System.out.println(numOfApples);
        System.out.println(numOfCustomers);
        System.out.println("$" + profit);

    }

}
