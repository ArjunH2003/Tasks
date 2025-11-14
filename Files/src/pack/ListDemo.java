package pack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,3,4,5);
		
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				
				System.out.println("Data : "+t);
				
			}
			
			
			
			
		};
		l.forEach(c);
		l.forEach(new MyObject());
	}

}
