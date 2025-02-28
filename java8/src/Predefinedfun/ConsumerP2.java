package Predefinedfun;

	import java.util.*;

	import java.util.function.Consumer;

	public class ConsumerP2 {

		public static void main(String[] args) {
			
			
			//consumer is just used to take i/p and process it but not return any value
			
			//convert the list pf vales to upperCase
			
			List<String> a=List.of("jeev","kumar");
			
			
			Consumer<String> s1=
					
				(str)->System.out.println(str.toUpperCase());
				
				
		//
			s1.accept("dss");
			
		//	i want list to be upper
			a.forEach(s1);
			
			//and then
			
			
			//adds1 to new list
			
			List<String>s2=new ArrayList();
			
			Consumer<String> s3=(str)->s2.add(str);
			
			
			Consumer<String> andThen = s1.andThen(s3);   //s2.
			
		
		  
		 a.forEach(andThen);
		 
		 System.out.println(s2);
		 
			
		}
	}



