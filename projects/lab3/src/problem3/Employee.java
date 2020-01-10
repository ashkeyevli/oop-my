package problem3;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	private double salary;
	protected Date hireDate;
	private String insuranceNumber;

	public Employee(String first_name, String last_name, Date hireDate, Double salary, String insuranceNumber) {
		super(first_name, last_name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}

	public boolean equals(Object o) {
		if (!super.equals(o)) {
			return false;
		}
		Employee e = (Employee) o;
		if (e.salary == salary && e.hireDate == hireDate && e.insuranceNumber.equals(insuranceNumber)) {
			return true;
		}
		return false;
	}

	public String toString() {
		return super.toString() + " works from " + hireDate + " has salary " + salary;
	}
	
	 public int compareTo(Employee o)
	 {
	  if(this == o) return 0;
	  Employee e = (Employee) o;
	  if(this.salary == e.salary) return 0;
	  if(this.salary < e.salary) return -1;
	  return 1;
	 }
	 public Object clone() throws CloneNotSupportedException {
		  
		  Employee e = (Employee)super.clone();
		  e.hireDate = (Date)hireDate.clone();
		  return e;
		  
}
	
}
