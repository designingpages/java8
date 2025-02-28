package Optional_Class;

import java.nio.file.spi.FileSystemProvider;
import java.util.Optional;

public class Or_Optional {

	public static void main(String[] args) {

		
		
		Optional<String> s=getName();
		
		//if the value is there then it return the same value else it return the sumplier optional implementation
		
//	Or_METHOD(s);
	
//	OrElse_Method(s);
	
		//orElse Get method it is used to return value if value is present else it return the suplier implementation
		
		//the diff b/w or and orelseGet is or method is return the optionalImplementation, but orelse Get is can return any value of functional implementaiptn
		
		
//	ORELSEGET_Method(s);
		
		
//	OrElseThrow_Method(s);
	
// orelsethrow with supplier is used to return value if value is present else it throw an exception but the diff is we can throw our own exception
		
		try {
	String s3=	s.orElseThrow(
				
				
				()->
				{
				return new ArithmeticException("It is my own predefined exe");
				
				}
				
				
				);
		
	System.out.println(s3);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	
		
		
	
	
	
	
		
		
		
		
	}


	private static void OrElseThrow_Method(Optional<String> s) {
		//orElsethrow if value is there then return the value, else it throw the no such elemnte predefined exe
			
			String throw1 = s.orElseThrow();
			
			System.out.println(throw1);
	}


	private static void ORELSEGET_Method(Optional<String> s) {
		String s2=s.orElseGet(
				
				
				()->{
					
					Optional<String> s1=Optional.of("hi");
					
					return s1.get();
				}
				
				
				);
		
		System.out.println(s2);
	}


	private static void OrElse_Method(Optional<String> s) {
		//orelse ;If value is present it return s the value 
		
		// else it returns the other value(insead of optional like Or method it dirextly retuns the value
		
		String result = s.orElse("hi this is orelse");
		System.out.println(result);
	}


	private static void Or_METHOD(Optional<String> s) {
		String s2= s.or(
					
					
					()->
					{
					return Optional.of("sai");	
					}
					
					).get();
		 
		 
			System.out.println(s2);
	}
	
	
	public static Optional<String> getName(){

		
		String name="saijeev  ";
		
		
		Optional<String> s=null;
		
		if(name!=null) {
			s=Optional.of(name);
		}
		else {
			s=Optional.empty();
		}
		
		return s;
	}
}
