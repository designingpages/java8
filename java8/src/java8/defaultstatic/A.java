package java8.defaultstatic;

public class A {

	public static void main(String[] args) {
		b b=new b();
		b.hi();
	}
}

interface one{
	
	default void hi() {
		System.out.println("Hi call of one");
	}
}

interface two{

	
	default void hi() {
		System.out.println("Hi call of two");
	}
}

class b implements one,two{

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		one.super.hi();
	}

	
	
}