public class Reciep {
    public static void main(String[] args) {
        String customer;
        long balance;
        customer = "Quỳnh";
        balance = 1_000_000;
        int transferAmount;
        transferAmount = 360_000;
        long newBalance;
        newBalance = balance - transferAmount;
        System.out.println("Tên khách hàng :\t\t\t" +customer);
        System.out.printf("Số dư ban đầu : \t\t%d%n" ,balance );
        System.out.printf("Số tiền muốn chuyển là :\t\t%d%n", transferAmount);
        System.out.printf("Số tiền còn lại sau khi chuyển là : \t\t%d%n",newBalance );
    }
}
