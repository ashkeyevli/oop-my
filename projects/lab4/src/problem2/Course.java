package problem2;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Vector;



class Course implements Serializable{
	String courseTitle;
	Textbook textbook; 
	Instructor instructor;	

	public Course(String courseTitle, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle;
		this.textbook = textbook;
		this.instructor = instructor;
	}

	

	public Course() {

		// TODO Auto-generated constructor stub

	}


	public String getCourseTitle() {
		return courseTitle;
	}

	

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	


	
	public void setTextbook(Textbook textbook) {

		this.textbook = textbook;

	}

	

	public void setInstructor(Instructor instructor) {

		this.instructor = instructor;

	}

	

	public String toString() {

		return String.format("Course title: %s. Instructor: %s. Textbook: %s", courseTitle, instructor, textbook);

	}

	

	

	public boolean equals(Object obj) {

		Course c = (Course) obj;

		return c.getCourseTitle().equals(courseTitle) && c.instructor.equals(instructor) && c.textbook.equals(textbook);

	}

	

	
}
