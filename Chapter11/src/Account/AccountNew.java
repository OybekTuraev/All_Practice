package Account;

import java.util.ArrayList;

public class AccountNew extends Account {
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public AccountNew() {
        super();
        name = "";
    }

    public AccountNew(String name, int id, double balance) {
        super(id, balance);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getTransactions() {
        StringBuilder allTransactions = new StringBuilder();
        for (int i = 0; i < transactions.size(); i++) {
            allTransactions.append(transactions.get(i).getDescription() + "\n");
        }

        return String.valueOf(allTransactions);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance,
                "withdrawal from account"));
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance,
                "deposit to the account"));
    }
}
