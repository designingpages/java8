package Optional_Class;

import java.util.Optional;

public class Map_FlatMap_Methods {

	private static Optional<Optional<String>> map;

	public static void main(String[] args) {
		
		Optional<String> s1=Optional.of("Saijeevan");
		
		//if value is present so we use map and map will get the value and perform some operation and returmn te result (optional vobj_
		
		
		Integer integer = s1.map(
				
				(val)->{
					
					return val.length();
				}
				
				
				).get();
		
		
		System.out.println(integer);
		
		
		//flat map
		
		
		Optional<Optional<String>> s2=Optional.of(Optional.of("vauy"));
		
		//before flat map what we do is
		
	 Optional<String> z2= s2.map(
				
				(val)->{
					
					 Optional<String> val2 = val;
					 return val2;
				}
				
				
				).get();
	 
	 String string = z2.map(val->val.toUpperCase()).get();
	 System.out.println(string);
	 
	 
	 //usimng flat map we need not use the Method like extrcting of optional can me be elimainated 
	 
	 
	
	 
	 String string2 = s2.flatMap(val2->{
		 
		 
		 return val2;
	 }).get();
	 
	 System.out.println(string2.toLowerCase());
	
	
	
		
		
		
		
		
	}
}
