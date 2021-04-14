package Account;

import java.util.Date;

public class Account {
    protected int id;
    protected double balance;
    protected double annualInterestRate;
    protected Date dateCreated;

    Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    /** Getters/ Accessors */
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    /**  Setters/Mutators  */
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /** Money related Methods */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double value) {
        balance -= value;
    }

    public void deposit(double value) {
        balance += value;
    }

    public String toString() {
        return "Account's string, balance: " + getBalance();
    }
}