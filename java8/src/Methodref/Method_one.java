package Methodref;


interface reverse{
	
	String rev(String name);
}
public class Method_one {
public static void main(String[] args) {
	
	reverse r=(name)->{
	
	return name.toUpperCase();
		
	};
	
	
	//this can be done using method reference
	
reverse r1=	String::toUpperCase;

System.out.println(r1.rev("vans"));


	System.out.println(r.rev("Jeevan"));
	
	+
}
}
