package Account;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    CheckingAccount() {
        super();
        overdraftLimit = -30;
    }

    CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if ((getBalance() - amount) > overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else {
            System.out.println("Amount exceeds overdraft limit:( Sorry");
        }
    }

    @Override
    public String toString() {
        return "Overdraft limit is $" + String.format("%.2f", overdraftLimit);
    }
}
