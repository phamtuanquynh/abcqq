public class Fee {
    static int fee(int amount) {
        return amount / 100;
    }

    public static void main(String[] args) {
        int amount=500_000;
        System.out.println(fee(amount));
    }
}