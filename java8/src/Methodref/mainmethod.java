package Methodref;

import java.util.Arrays;
import java.util.Comparator;

public class mainmethod {

	public static void main(String[] args) {
		
		//Employeevalidation e1=Employee::isvalidEmp;
		
		
		//give emp
		
		//Employee e2=new Employee();
		
	//	e2.setId(1);
		//e2.setName("sai");
	//	System.out.println(e1.isvalid(e2));
		
	//	Employeevalidation ez=e2::isidvalid;
		
		//System.out.println(ez.isid(e2));
		
		//Employeevalidation e3=Employee::isvalidEmp;
		
		
	//Employeevalidation z1=	Employee::isname;
//System.out.println(	z1.isvalid(e2));

		
		//create constructor using references
		
	

//reference to arbitrary

Integer  a[]= {1,4,245,7,9};


	
 
 
 Arrays.sort(a, (o1, o2) -> {
	   
	return  o1.compareTo(o2);
	});

 
 Arrays.sort(a,Integer::compareTo);
 

for(Integer s:a) {
	System.out.println(s);
}



Employeevalidation s3=	Employee::new;
s3.cons(1);

	}
}
