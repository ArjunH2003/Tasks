package pack4;

public class Theatre3 implements MalMovies,TamilMovies{
	
	
	int LokahPrice;
	int HridayapoorvamPrice;
	int VikramPrice;
	int KaithiPrice;

	@Override
	public void Lokah(int price) {
		
		LokahPrice = price;
		System.out.println("Price of Lokah : "+price+" Rs");
		
	}

	@Override
	public void Hridayapoorvam(int price) {
		
		HridayapoorvamPrice = price;
		System.out.println("Price of Hridayapoorvam : "+price+" Rs");
		
	}
	
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

	@Override
	public void display() {
		
		int total = LokahPrice+HridayapoorvamPrice+VikramPrice+KaithiPrice;
		System.out.println("Total Price : "+total);

		
	}

}
