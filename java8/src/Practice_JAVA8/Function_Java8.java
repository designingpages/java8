package Practice_JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//find square of a number 8--64


class Emp{
	private int sal;

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Emp(int sal) {
		super();
		this.sal = sal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sal);
	}

	@Override
	public boolean equals(Object obj) {
		
		Emp e1=(Emp)obj;
		
		System.out.println(e1.sal);
		System.out.println(this.sal);
		return e1.getSal()==this.sal;
	}
	
	
	
}
public class Function_Java8 {

	public static void main(String[] args) {
		
	//	Function_Practice();
		
	//	Predicate_ex();
		
		
	//	consumer_pra();
		
		
		Supplier<String> s=()->{

			return "Jeev".toLowerCase();

		};	
		
		//hi(s);
		
System.out.println(s.get());	
	}
	
	
	public static void hi(Supplier<Integer> s) {
		System.out.println(s.get());
	}

	private static void consumer_pra() {
		String a[]= {"je","va","nn"};//upper
		
		
		List<String> asList = Arrays.asList(a);
		
	
		Consumer<String> s=(s1)->{
			String upperCase = s1.toUpperCase();
			System.out.println(upperCase);
		};
		
		
		//s.accept("hgf");
		
		Consumer<String> s2=(s1)->{
			
			System.out.println( s1.length());
		};
	
      Consumer<String> andThen = s2.andThen(s);
      
      asList.forEach(andThen);
	}

	private static void Predicate_ex() {
		Predicate<Integer> s2=(i)->{
			
			return i>21;
		};
		
		boolean test = s2.test(23);
		System.out.println(test);
		
		
		Predicate<Emp> e1=(e)->{
		
			return e.getSal()>25000;
			
		};
		
		Emp e3=new Emp(26000);
		boolean test2 = e1.test(e3);
		System.out.println(test2);
		
	boolean test3 = e1.negate().test(e3);
	System.out.println(test3);
	


	Predicate<Emp> ea=Predicate.isEqual(e3);
	Emp e4=new Emp(26000);
	
	
	
	boolean test4 = ea.test(e4);
	System.out.println(e4);
	System.out.println(e3);
	System.out.println("test4" +test4);
	}

	private static void Function_Practice() {
		//fun1
		Function<Integer,Integer> z1=(i)->{
			
			return i*i;
		};
		
		
		//fiun2 
		
		//if even then only return value else return -1
		
		Function<Integer,Integer> z2=(i)->{
			
			return (i%2==0)?i:-1;
		};
		
		
		Integer apply = z2.compose(z1).apply(5);
		System.out.println(apply);
		
		
		Function<Integer,Integer> s2=Function.identity();
		
		Integer apply2 = s2.apply(25);
		System.out.println(apply2);
	}
}
