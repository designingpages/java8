package StreamApi;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	private int id;
	private String name;
	private String city;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", gender=" + gender
				+ ", department=" + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, String city, int age, String gender, String department, int yearOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	
}
public class Example1_Map {

	
	
public static void main(String[] args) {
	
	List<Employee> z1=getEmployees();
	//streams use case
	//req get names out and make it as la list
	
	//before streams
	

	
	List<String> s1=new ArrayList<>();
	
	for(Employee e1:z1) {
		s1.add(e1.getName());
	}
	
	System.out.println(s1);
	
	
	//after streams
	
	Stream<Employee> Emp = z1.stream();
	System.out.println("----ex 1------");	
	
	Stream<String> map = Emp.map(emp->emp.getName());
	
	List<String> list = map.toList();
	
	System.out.println(list);
	
	
	//2nd get playes whose age is more than 30 and form them to a new list
	                          //intermediate                //intermediate   //termina
	System.out.println("----ex 2------");
	List<Employee> list2 = z1.stream().filter(emp->emp.getAge()>30).map(emp->emp).toList();
	System.out.println(list2);
	
	
	
	//3rd print employee cities with unique city
	
	//distint it is used to print unique data
	
	//foreach : it takes the consumer
	System.out.println("----ex 3------");
	
	z1.stream().map(emp->emp.getCity()).distinct().forEach(val->System.out.println(val));
	
	z1.stream().map(emp->emp.getCity()).distinct().forEach(System.out::println);
	
	//4th: get count of employees whose sal is > 20k
	
	System.out.println("----ex 4--");
	
	
	long count = z1.stream().filter(emp->emp.getSalary()>20000).count();
	
	System.out.println(count);
	
	//5th : get first 3 employee objects as a list
	System.out.println("---ex 5-----");
	
	//limit is used to produce sublist like if limit is 3 so if make 3 employees and then allows us to do any operation
	                                   //inter  //terminal
	List<Employee> list3 = z1.stream().limit(3).toList();
	
	System.out.println(list3);
	
	
	//6th:i want to skip first 3 employees and i want to collect the  other employees data
	
	System.out.println("---ex 6-----");
	
   z1.stream().skip(3).forEach(System.out::println);
   
   
   //7th: we have to verify any emp under age 18 or not
   
   System.out.println("---ex 7---");
   
   List<Employee> list4 = z1.stream().filter(emp->emp.getAge()<18).map(emp->emp).toList();
	
   System.out.println(list4);
   
    boolean anyMatch = z1.stream().anyMatch(emp->emp.getAge()<18);
    System.out.println(anyMatch);
    
    
    //8th: check every employee is joined after 2010 or not
    System.out.println("--ex 8--");
   
    boolean allMatch = z1.stream().allMatch(emp->emp.getYearOfJoining()>2010);
    System.out.println(allMatch);
    
    
    //9th: check every emp salary is less than 10k or not
    
    //nonematch : is exact opposite to allMatch like all the data should be false then only we get true
   
    System.out.println("--ex 9--");
    boolean noneMatch = z1.stream().noneMatch(emp->emp.getSalary()<10000);
    System.out.println(noneMatch);
    
    
    //10th: findAll it is used to get only one value from the multi[le values, it returns optional obj
    
    System.out.println("--ex 10 --");
    
    Employee employee = z1.stream().findAny().get();
    System.out.println(employee);
    
    
    //11th:FindFirst : it will always return first element no matter what but findany may or many not return first value
    
    System.out.println("--ex 11--");
    
   Employee employee2 = z1.stream().findFirst().get();
   System.out.println(employee2);
   
   //12th: get Employees names in sorted order
   
   //sorted(): sorting normally
   
   System.out.println("--ex 12--");
   
	   String[] array = z1.stream().map(emp->emp.getName()).sorted().toArray(String[]::new);
	  
	   System.out.println(Arrays.asList(array));
   
   //13th: sorting using comparator
   System.out.println("--ex 13--");
   List<Employee> list5 = z1.stream().sorted((c1,c2)->c1.getName().compareTo(c2.getName())).toList(); 
   System.out.println(list5);
   
 //  z1.stream().sorted(String::compareToIgnoreCase).toList();
  
   
   
   
   //14th:To get minimum salary emp details
   
   //14: get minimum salary employee details
   System.out.println("--ex 14--");
   
  z1.stream().sorted((c1,c2)->{
	  
	  
	  if(c1.getSalary()>c2.getSalary()) {
		  return 1;
	  }
	  else {
		  return -1;
	  }
  }
  
		  
		  ).limit(1).forEach(System.out::println);
  
  
  //the above method we can do by using min() method
  
  Employee employee3 = z1.stream().min((c1,c2)->(int)(c1.getSalary()-c2.getSalary())).get();
 System.out.println(employee3 ); 
 
 //same like min we have max'
 
 
 //15th average() : used to  find avg of all values
 
 OptionalDouble average = z1.stream().mapToDouble(emp->emp.getSalary()).average();
 System.out.println(average.getAsDouble());
 
 //maptodouble return doublestream similarly we have intStream and longstream.
 
 
 //16th: peak it is used to perform some action/trace to the datasource before processting without effecting the original source
 
 //req:out of all emp find out whose date of joining is >2015 and track how many emp's being prpcessed
 
 System.out.println("--ex 16--"
 		+ ""
 		+ ""
 		+ ""
 		+ ""
 		+ ""
 		+ ""
 		+ "");
 //List<Employee> filter = z1.stream().peek(System.out::println).filter(emp->emp.getYearOfJoining()>2020).toList();
 //System.out.println(filter);
  //give peak after filter ..if u keep here what ever values after filter those will be traced and passed to tolist
 List<Employee> filter2 = z1.stream().filter(emp->emp.getYearOfJoining()>2020).peek(System.out::println).toList();
System.out.println(filter2);





///


/*
 *  Collectors class used to colelct value from stream
 * 
 * 
 */

//ex 1 Collect all employee names as list       whose age >25
System.out.println("__________________________________________"
		+ ""
		+ ""
		+ "Collectors"
		+ "++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("Example 1");
List<String> list6 = z1.parallelStream().filter(emp->emp.getAge()>25).map(emp->emp.getName()).collect(Collectors.toList());
System.out.println(list6);




//Example 2 Get unique dept names
System.out.println("Example 2");

//1st way
List<String> list7 = z1.stream().map(emp->emp.getDepartment()).distinct().toList();
System.out.println(list7);


//2nd way

Set<String> collect = z1.stream().map(Employee::getDepartment).collect(Collectors.toSet());

System.out.println(collect);



//Example 3

System.out.println("Example 3");

HashMap<Integer,Double> h1=new HashMap<>();



 Map<Integer, Double> collect2 = z1.stream().collect(Collectors.toMap(emp->emp.getId(),emp->emp.getSalary()));
 System.out.println(collect2);
 
 
 //Example groupingBy
 
 System.out.println("Example 4");
 
 //Get avg salary of each department wise
 
 Map<String, Double> collect3 = z1.stream().collect(
		 
		 Collectors.groupingBy(emp->emp.getDepartment(),Collectors.averagingDouble(emp->emp.getSalary()))
		 
		 
		 
		 );
 /*
 DoubleSummaryStatistics summary = collect3.values().stream()
		    .mapToDouble(Double::doubleValue)
		    .summaryStatistics();
 
 System.out.println(summary+"");
 
 */
 System.out.println(collect3);
 
 //Example Sumarizing method
 
 System.out.println("Example 5");
 
 
 DoubleSummaryStatistics collect4 = z1.stream().collect(
		 
		 
		 
		 Collectors.summarizingDouble(emp->emp.getSalary())
		 
		 
		 
		 );
 
 System.out.println(collect4);
 
 
 //example 6
 System.out.println("ex 6 differnet-----");

 //Req Get count of employees gender wise
 
 Map<String, Long> collect5 = z1.stream().collect(Collectors.groupingBy(emp->emp.getGender(),Collectors.counting()));
 System.out.println(collect5);
 
 
 //Example  7: summing,Summarizing
 //Summing all employees salaries
 
 //summing will just sum all values
 System.out.println("Example 7");
 Double collect6 = z1.stream().collect(Collectors.summingDouble(Employee::getSalary));
 System.out.println(collect6);
 
 //summarizing is used to give all info
 DoubleSummaryStatistics collect7 = z1.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
 
 System.out.println(collect7);
 
 
 //example 8
 
 //maxBy()
 
 //req: find max age of employees ..u can also use min() and max() terminal methods
 System.out.println("Example 8");
 
 Optional<Employee> collect8 = z1.stream().collect(Collectors.maxBy(
		 
		 (c1,c2)->c1.getAge()-c2.getAge()
		 
		 ));
 
 System.out.println(collect8.get());
 
 
 
 //Example 9
 
 //joining:it will join values
 
 //req : i want to get all department names with delimiter:::
 
System.out.println("Example 9");

String collect9 = z1.stream().map(emp->emp.getDepartment()).collect(Collectors.joining(":::"));
System.out.println(collect9);
}


public static List<Employee> getEmployees() {
	
	List<Employee> e1=new ArrayList<>();
	
	e1.add(new Employee(1,"rohit","mumbai",36,"male","java",2013,30000));
	
	e1.add(new Employee(2, "Amit", "delhi", 29, "male", "python", 2016, 12000));
	e1.add(new Employee(3, "Sneha", "pune", 32, "female", "java", 2014, 18000));
	e1.add(new Employee(4, "Vikas", "bangalore", 41, "male", "javascript", 2011, 25000));
	e1.add(new Employee(5, "Neha", "mumbai", 27, "female", "java", 2018, 11000));
	e1.add(new Employee(6, "Ankit", "delhi", 34, "male", "c++", 2012, 21000));
	e1.add(new Employee(7, "Priya", "bangalore", 30, "female", "python", 2015, 50000));
	e1.add(new Employee(8, "Rahul", "pune", 39, "male", "java", 2022, 28000));
	e1.add(new Employee(9, "Sakshi", "mumbai", 25, "female", "javascript", 2020, 70000));
	e1.add(new Employee(10, "Arjun", "bangalore", 37, "male", "c#", 2011, 23000));

	
	return e1;
}
}
