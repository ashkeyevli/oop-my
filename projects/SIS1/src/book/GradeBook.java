package book;
import ref.Student;
import java.util.ArrayList;




public class GradeBook {
	 public Course course;
	 public ArrayList<Student> list;
	 double sum = 0;
	 double average;
	 int max = 0;
	 int min = 100;
	 int minID, maxID;
	 int r = 90;
	 private static final int RANGE_SIZE = 10;
	 public static int low[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
	 public static int high[] = { 9, 19, 29, 39, 49, 59, 69, 79, 89, 100 };

	 public String[] count = {"","","","","","","","","",""};

	 public GradeBook() {
		 
	 }
	 public GradeBook(Course course) {
	  this.course = course;
	  this.list = new ArrayList<>();
	 }

	 public void addStudent(Student s) {
	  for (int i = RANGE_SIZE - 1; i >= 0; i--) {
	   if (s.getMark() >= r) {
	    count[i]+="*";
	    break;
	   }
	 
	   r = r - 10;
	  }
	  r = 90;
	  this.list.add(s);
	 }

	 public void displayMessage() {
	  System.out.println("Welcome to the grade book for CS101 Object-oriented Programming and Design!"+"\n" + "Please, input grades for students:");
	 }

	 public void displayGradeReport() {
	  determineClassAverage();
	  outputBarChart();
	 }

	 public void determineClassAverage() {
	  int l = list.size();

	  for (int i = 0; i < l; i++) {
	   sum = sum + list.get(i).getMark();
	   if (list.get(i).getMark() > max) {
	    max = list.get(i).getMark();
	    maxID = i;
	   }
	   if (list.get(i).getMark() < min) {
	    min = list.get(i).getMark();
	    minID = i;
	   }
	  }

	  average = sum / list.size();

	  System.out.println("Average mark:" + average + "  " + "Maximum:" + max + "  " + maxID + "  "
	    + "Minimum:" + min + "  " + list.get(minID));
	 }

	 public void outputBarChart() {

	  System.out.println("Grades distribution:");
	  for (int i = 0; i < RANGE_SIZE; i++) {
	  
	   System.out.println(low[i] + "-" + high[i] + ":" + count[i]);
	 	   
	  }

	 }

	 public String toString() {
	  return Double.toString(average);
	 }

	
}
