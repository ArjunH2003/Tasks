package ExceptionHandling;

public class InvalidAmountException extends Exception{
	
	int amount;
	
	public InvalidAmountException(int amount) {
		
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "InvalidAmountException [amount=" + amount + "]";
	}
	
	
	
	


}
