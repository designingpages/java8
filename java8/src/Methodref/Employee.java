package Methodref;

public class Employee {

	private int id;
	private String name;
	
	
	public String getName() {
		return name;
	}


	Employee(int id){
		this.id=id;
		System.out.println("1para");
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

//reference to static method
	
	
	
	//reference to instance method
	
	boolean isidvalid(Employee e) {
		return (e.id>5)?true:false;
	}
	
	boolean isname() {
		return (this.name==null)?false:true;
		
	}
	
	
}
