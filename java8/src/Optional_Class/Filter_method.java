package Optional_Class;

import java.util.Optional;

public class Filter_method extends Or_Optional {

	public static void main(String[] args) {
		

		Optional<String> s1=Or_Optional.getName();
		
		//Filter method takes predicate like if the value is present then it checks the conditioan and if true ait returbs the Optional obj else it returns the empty obj
		
		Optional<String> filter = s1.filter(
				
				
				(Val)->{
					
					
					 return Val.length()==8;
				}
				//if the condition not satisfies it is getting nosuch elemnt exxception right so what we can do is we can give a default value by using the or methods
				
				
				).or(
				
				
				
()->{
				Optional<String>a=Optional.of("saijeevankumart");
				return a;
				}
				
				
				);
		
		System.out.println(filter.get());//if the condition not satisfies it is getting nosuch elemnt exxception right so what we can do is we can give a default value by using the or methods
		
		
		
	}
	
	

	
	
	
	
}
