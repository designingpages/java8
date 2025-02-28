package Optional_Class;

import java.util.Optional;

public class IfPresentandifpresentorelse {

	public static void main(String[] args) {
		
		
		
		//ifpresent: if value is present do something, if present we are doing one function
		
		    Optional<String> name = getName2();
		    
		    
		name.ifPresent(
				
				
				
				(v)->System.out.println(v.toUpperCase())
				
				);
		
		//so if null also it is not throwing any error
		
		//isPresentOrelse
		
		name.ifPresentOrElse(
				
				//1st if prensent i'm doing conversion
				
				(v)->
				{
				System.out.println("value there");
				System.out.println(v.toUpperCase())	;
				
				}
				
				,
				()->System.out.println("value not there")
				
				);
		
	}
	
	

public static Optional<String> getName2() {

String name="saij";//instead of returning the null value use Empty;
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
