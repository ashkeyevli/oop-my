package problem3;

import java.util.Vector;
import java.util.Collections;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException{
		Date d = new Date();
		Person p = new Person("Ali", "Ashkeev");
		Person p2 = new Person("Asset", "Tuzelbayev");
		System.out.println(p.equals(p2));
		System.out.println(p);
		System.out.println(p.getLastName());

		Employee e = new Employee("1st", "Employee", d, 150.2, "blabla");
		Employee e2 = new Employee("1st", "Employee", d, 150.2, "blabla");
		Employee e3 = new Employee("2nd", "Employee", d, 190.1, "blabla2222");
		Employee e4 = new Employee("3rd", "Employee", d, 190.1, "blabla2222");
		System.out.println(e.equals(e2));
		System.out.println(e);
		System.out.println(e.getLastName());

		Vector<Employee> employees = new Vector<Employee>();
		employees.add(e3);
		employees.add(e);
		employees.add(e2);
		Vector<Employee> employees2 = new Vector<Employee>();
		employees2.add(e3);
		employees2.add(e);
		employees2.add(e4);
		Manager m = new Manager("1st", "Manager", d, 300.1,2.5, "blabla", employees);
		Manager m2 = new Manager("1st", "Manager", d, 300.1, 2.332, "blabla", employees2);
		System.out.println(m.equals(m2));
		Collections.sort(employees, new SortName());
		System.out.println(m.compareTo(m2));
		System.out.println(d);
	}

}
