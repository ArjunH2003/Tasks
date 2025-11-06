package pack4;

public class Theatre1 implements MalMovies{
	
	int LokahPrice;
	int HridayapoorvamPrice;

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
	public void display() {
		int total = LokahPrice+HridayapoorvamPrice;
		System.out.println("Total price : "+total);
		
		
	}

}
