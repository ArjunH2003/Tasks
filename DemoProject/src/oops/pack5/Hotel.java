package pack5;

public class Hotel implements Veg,NonVeg {
	
	int total = 0;

	@Override
	public void ChickenBiriyani(int cost) {
		
		int cb_cost = cost;
		total+=cb_cost;
		System.out.println("Cost of Chicken Biriyani : "+cost);
		
	}

	@Override
	public void Mutton(int cost) {
		
		int m_cost = cost;
		total+=m_cost;
		System.out.println("Cost of Chicken Biriyani : "+cost);
		
	}

	@Override
	public void VegBiriyani(int cost) {
		
		int vb_cost = cost;
		total+=vb_cost;
		System.out.println("Cost of Chicken Biriyani : "+cost);
		
	}

	@Override
	public void Idli(int cost) {
		
		int id_cost = cost;
		total+=id_cost;
		System.out.println("Cost of Chicken Biriyani : "+cost);
		
		
	}
	
	public void bill() {
		
		System.out.println("Total Cost : "+total);
	}

}
