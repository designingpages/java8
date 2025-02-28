package java8.defaultstatic;

@FunctionalInterface
interface calculate{
	public int operation(int a,int b);
	
	static void hi() {
		System.out.println("hi call static");
	}
	
	default void hello() {
		System.out.println("hello call default");
	}
}
public class Functiinter_Lamda {

	public static void main(String[] args) {
		
		//1st lamda ex
		
		calculate add=(int a,int b) ->{
			return a+b;
		};
		
	System.out.println(	add.operation(1,2));
		
		
		//2nd lamda ex
		calculate sub=(a,b)->{
			
			return a-b;
		};
		
	System.out.println(	sub.operation(10,11));
		
		//3rd lamda ex
		
		calculate mul=(p,q)->p*q;  //return automatically
	System.out.println(	mul.operation(2, 3));
		
		
	//can we call default method using lamda ref? yes
	mul.hello();
	
	//can we call static method using lamda ref? no
	
	//https://topmate.io/genzcareer/959954 --material
	
	
	calculate.hi();
		
	}
	
	
}
