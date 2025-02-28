package Predefinedfun;

import java.util.function.Function;

public class FunctionLamda {

	public static void main(String[]args) {
		
		
		
		Function<Integer,Double> z1=(i)->{
			return i/2.0;
		};
		
		System.out.println(z1.apply(10));
		
		
		//
		
		// 2 uppercase check
		Function<String,String> fun1=(a)->{
			return a.toLowerCase();
		};
		
		System.out.println(fun1.apply("JEEVAN"));
		
		//1 null check 
		
		Function<String,String> fun2=(str)->{
			return (str==null)?"Enter a valid string":str;
		};
		
		
		//Defaut methods in Function
		
		
		
		String apply = fun2.andThen(fun1).apply("HTTYUIUY");
		System.out.println(apply);
		
		
		//compose compose is just a reverse of andThen
	//	fun2.compose(fun1).apply(null);
		
		
		//static method
		Function<Integer,Integer> s1=Function.identity();
		
		Integer apply2 = s1.apply(100);
		System.out.println(apply2);
		}
	
}
