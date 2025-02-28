package Practice_JAVA8;

import java.util.Optional;

public class Optional_class {

	public static void main(String[] args) {
		
		
		Optional<Integer> s1 = hi();
		
		Optional<Optional<String>> a=Optional.of(Optional.of("saij"));
		
	
		
		Optional<String> map2 = s1.map(val->val.toString()+"ki");
		System.out.println(map2.get());
		a.flatMap(val->val);
		String upperCase = a.flatMap(val->val).get().toUpperCase();
		System.out.println(upperCase);
		
		Optional<String> map = a.map(val->val).map(val->val.get().toUpperCase());
		System.out.println(map.get());
		//System.out.println(map.get());
	}
	
	
	public static Optional<Integer> hi() {
		
		
		Integer a1=23;
		Optional<Integer> s2=null;
		if(a1!=null) {
		
		 s2=Optional.of(a1);
		}
		else {
			s2=Optional.empty();
		}
		
		
		return s2;
	}
}
