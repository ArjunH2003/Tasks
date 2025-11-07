package pack3;

public class SBIBank implements Loan{

	@Override
	public void interestRate(int amount) {

		System.out.println("The interest of SBI Bank is : "+(amount*5)/100+" %");
		
	}

}
