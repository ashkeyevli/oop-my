package problem3;
import java.util.Comparator;
public class SortName implements
Comparator<Employee>{
	 public int compare(Employee a,Employee b) {
	  return a.getFirstName().compareTo(b.getLastName());
	 }
	}