package Inheritence;

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class CheckingAccount extends BankAccount {
    double overdraftLimit;

    CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied! Overdraft limit reached.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount(1000, 500);
        acc.withdraw(1200);
        acc.withdraw(400);
    }
}
