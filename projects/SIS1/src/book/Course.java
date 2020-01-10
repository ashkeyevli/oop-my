package book;

public class Course {

	 String courseName;
	 
	 String courseDis;

	 int credits;

	 String coursePre;
	 
	 
	 public Course(String courseName, String courseDis, int credits, String coursePre)
	 {
	  this.courseName = courseName;
	  this.courseDis = courseDis;
	  this.credits = credits;
	  this.coursePre = coursePre;
	    }
	 public String toString() 
	 {
	  return courseName + "  " + courseDis + "  " + credits + "  " + coursePre;
	 }
}
