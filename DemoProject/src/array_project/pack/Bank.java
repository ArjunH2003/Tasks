package pack;

public class Bank {
	int amount = 2000;
	void balance() {
		System.out.println("Account balance : "+amount);
	}
	void withdraw(int amount) {
        if (amount <= this.amount) {
            this.amount -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }

    void deposit(int amount) {
        if (amount > 0) {
            this.amount += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount: " + amount);
        }
    }


	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.balance();
		b1.withdraw(500);
		b1.balance();
		b1.withdraw(10000);
		b1.balance();
		
		
	}
}
