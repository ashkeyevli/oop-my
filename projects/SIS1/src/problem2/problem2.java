package problem2;
import java.util.Scanner;


import ref.Student;
import book.Course;
import book.GradeBook;
public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan= new Scanner(System.in);
	  GradeBook book = new GradeBook();
	  book.displayMessage();
	  Course course = new Course("OOP", "Object-oriented programming", 3, "PP");
	  GradeBook journal = new GradeBook(course);
	    for (int i = 0; i<10; i++)
	    {
	      String Name = scan.next();
	      int mark = scan.nextInt();
	      Student student = new Student(Name, mark);
	      journal.addStudent(student);
	     }
	    journal.displayGradeReport();
	 }
	
	

}
