package Account;

public class Exercise11_08 {
    public static void main(String[] args) {
        AccountNew account = new AccountNew("George", 1122, 1000);
        account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Name Holder: " + account.getName());
        System.out.println("Interest Rate: " + account.getAnnualInterestRate());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("All transactions: " + account.getTransactions());
    }
}
