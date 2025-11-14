package pack;

import java.util.function.Consumer;

public class MyObject implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("Data : "+t);
		
	}
	
	

}
