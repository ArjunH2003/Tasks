package pack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ListDemo1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> s = l.stream();
		s.forEach(nums->System.out.println(nums));
		//s.forEach(nums->System.out.println(nums));
	}

}
