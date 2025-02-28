package Predefinedfun;

import java.util.Objects;
import java.util.function.Predicate;

class Employee {
    private int sal;
    private String name;

  
  
    @Override
	public int hashCode() {
		return Objects.hash(name, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		System.out.println("kjhg");
		return Objects.equals(name, other.name) && sal == other.sal;
	}

	public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int sal, String name) {
        this.sal = sal;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [sal=" + sal + ", name=" + name + "]";
    }
}

public class Predicate_SAM {
    public static void main(String[] args) {
        Employee e1 = new Employee(25, "sai");
        Employee e2 = new Employee(25, "sai");
        System.out.println(e1.equals(e2)+" hi");

        // Predicate to check if salary is greater than 20
        Predicate<Employee> z1 = e -> e.getSal() > 20;
        System.out.println(z1.test(e1)); // true

        // Predicate to check if name is not null
        Predicate<Employee> z2 = e -> e.getName() != null;
        System.out.println(z1.and(z2).test(e1)); // true

        e1.setSal(0);
        System.out.println(z1.or(z2).test(e1)); // true (name is not null)

        // Negate predicate
        System.out.println(z2.negate().test(e1)); // false (name is not null)

        // Predicate.isEqual() static method
        System.out.println("Static method---");
        Predicate<Employee> x1 = Predicate.isEqual(e1);
       

      //  System.out.println("e1.equals(e2): " + e1.equals(e2)); // true
        System.out.println("Predicate.isEqual(e1).test(e2): " + x1.test(e2)); // true
    }
}
