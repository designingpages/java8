package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class Typesofdeclaring {

	public static void main(String[] args) {
		
		List<String> of1 = List.of("sai","aa","kk");
		
		Stream<String> s1 = of1.stream();
		
		
		String s2[]= {"jeev","hhu"};
		
		Stream<String> stream = Arrays.stream(s2);
		
		
		Stream<String> of = Stream.of("j","lkl");
		
		
		Stream<String> stream2 = Stream.generate(()->"l");
		
		Stream.Builder<String> builder = Stream.builder();
		
		Stream<String> stream3 = builder.add("o").add("k").build();
		
		Stream<Object> empty = Stream.empty();
		
		
		

		
	
	}
}
