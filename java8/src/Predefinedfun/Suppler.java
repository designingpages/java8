package Predefinedfun;

import java.util.function.Supplier;

public class Suppler {

	public static void main(String[] args) {
		
		
		Supplier<String> h=()->{
			
			return "Dbconnection";
		};
		
		System.out.println( h.get());
		
		//so u can call the Dbconnection any nuber of times without paassing i/p
String hi = hi(h);
System.out.println(hi);
	}
	
	//All the function implementations can be passed as method args
	public static String hi(Supplier<String> h) {
	return 	h.get();
	}
	
}
