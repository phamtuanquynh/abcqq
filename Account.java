public class Account {
    private String accountNumber;
    private String owner;
    private long balance;
    
    public Account(String accountNumber, String owner, long balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account[number=" + accountNumber
                + ", owner=" + owner
                + ", balance=" + balance + "]";
    }
}
