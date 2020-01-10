package problem3;

import java.util.Vector;
import java.util.Date;
public class Manager extends Employee implements Comparable<Employee> {
	private Vector<Employee> employees;
		protected double bonus;
	public Manager(String first_name, String last_name, Date hireDate, Double salary, Double bonus, String insuranceNumber) {
		super(first_name, last_name, hireDate, salary, insuranceNumber);
		Vector<Employee> employees = new Vector<Employee>();
		this.bonus = bonus;
	}

	public Manager(String first_name, String last_name, Date hireDate, Double salary, Double bonus, String insuranceNumber,
			Vector<Employee> employees) {
		super(first_name, last_name, hireDate, salary, insuranceNumber);
		this.employees = employees;
		this.bonus = bonus;
	}

	public boolean equals(Object o) {
		if (!super.equals(o)) {
			return false;
		}
		Manager m = (Manager) o;
		// if (m.employees.equals(employees))
		// return true;
		for (int i = 0; i < employees.size(); i++) {
			if (!employees.get(i).equals(m.employees.get(i)))
				return false;
		}
		return true;
	}

	public String toString() {
		return super.toString() + " has " + employees.size() + " employees in team";
	}
	
	public void addEmployee(Employee employees){
		this.employees.add(employees);
		
	
	}
	public int compareTo(Employee e)
	 {
	  if(super.compareTo(e) == 0)
	  { 
	   Manager m = (Manager) e; 
	   if(this.bonus < m.bonus) return -1;
	   if(this.bonus > m.bonus) return 1;
	   return 0;
	  }
	  
	  return super.compareTo(e);
	 }

}
