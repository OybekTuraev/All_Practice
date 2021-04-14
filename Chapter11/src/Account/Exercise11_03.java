package Account;

public class Exercise11_03 {
    public static void main(String[] args) {
        Account account = new Account(45, 5000);
        CheckingAccount checkingAccount = new CheckingAccount(10, 5600, -90);
        SavingsAccount savingsAccount = new SavingsAccount(65, 1200);

        account.setAnnualInterestRate(4.5);
        checkingAccount.setAnnualInterestRate(4.5);
        savingsAccount.setAnnualInterestRate(4.5);

        account.withdraw(1200);
        checkingAccount.withdraw(1200);
        savingsAccount.withdraw(1200);

        account.deposit(4100);
        checkingAccount.deposit(4100);
        savingsAccount.deposit(4100);

        System.out.println(account.toString());
        System.out.println(checkingAccount.toString());
        System.out.println(savingsAccount.toString());
    }
}
