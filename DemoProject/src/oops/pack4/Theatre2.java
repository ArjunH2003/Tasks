package pack4;

public class Theatre2 implements TamilMovies {
	
	int VikramPrice;
	int KaithiPrice;
	

	@Override
	public void Vikram(int price) {
		
		VikramPrice = price;
		System.out.println("Price of Vikram : "+price+" Rs");
		
	}

	@Override
	public void Kaithi(int price) {
		KaithiPrice = price;
		System.out.println("Price of Kaithi : "+price+" Rs");
		
	}

	
	public void display() {
		
		int total = VikramPrice+KaithiPrice;
		System.out.println("Total Price : "+total);
		
		
		
	}
	
}
	
//	public static void main(String[] args) {
//		TamilMovies t = new Theatre2();
//		t.Vikram(200);
//		t.Kaithi(200);
//	}
//

