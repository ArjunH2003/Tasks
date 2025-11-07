package pack3;

public class ICICIBank implements Loan {

	@Override
	public void interestRate(int amount) {
		
		System.out.println("Interest of ICICIBank:"+(amount*6)/100+" %");		
	}

}
