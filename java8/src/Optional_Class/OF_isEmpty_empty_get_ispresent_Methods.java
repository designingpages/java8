package Optional_Class;

import java.util.Optional;

public class OF_isEmpty_empty_get_ispresent_Methods {

	public static void main(String[] args) {

		
		
		//before optional class
		
		String name = getName();//so we are not 100 percent sure that we will only get a valid value, there is a equal chance that we may get null
		
		if(name!=null) {
		System.out.println(name.toUpperCase());  //but every time using this null is not that much correct
		
		}
		else {
			System.out.println("valid vale enter");
		}
		
		Optional<String> name2=getName1();
		
		if(name2.isPresent()) { //ispresent is used to check whether the value is present or not
			System.out.println(name2.get().toUpperCase());//get used to get the value from optinal
		}
		
		Optional<String> name3=getName2();	
		if(name3.isEmpty()) {
			System.out.println("yes its empty");
		}
		else {
			System.out.println("not empty");
		}
		
	}
	
	public static String getName() {



		
		String s1=null;
		
		return s1;
	}

	
	//use optional class
	
public static Optional<String> getName1() {



		Optional<String>  s1=Optional.of("ssi");
		System.out.println("mull");
		return s1;
	}



public static Optional<String> getName2() {

String name=null;//instead of returning the null value use Empty;
Optional<String>  s1;
if(name==null) {
	 s1=Optional.empty();
}
else {
	 s1=Optional.of(name);
}
	
	return s1;
}


	
	
}
