package problem3;

import java.util.Comparator;
public class SortHireDate implements Comparator<Employee>{
	 
	 public int compare(Employee a,Employee b) {
	  return a.hireDate.compareTo(b.hireDate);
	 }
	}
