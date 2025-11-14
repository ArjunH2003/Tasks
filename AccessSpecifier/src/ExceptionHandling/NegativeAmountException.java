package ExceptionHandling;

public class NegativeAmountException {
	
int amount;
	
	public NegativeAmountException(int amount) {
		
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "InvalidAmountException [amount=" + amount + "]";
	}

}
