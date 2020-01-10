package ref;

public class Student {
	private String name;
	 private int id;
	 private int year;
	 private int mark;
	 private static int index = 1;

	 public Student(String name, int id, int year) {
	  this.name = name;
	  this.id = id;
	  this.year = year;
	 }

	 public Student(String name, int mark) {
	  this.name = name;
	  this.mark = mark;
	  this.id = index;
	  index++;

	 }

	 public String toString() {
	  return name + id + mark;
	 }

	 public String getname() {
	  return name;
	 }

	 public int getid() {
	  return id;
	 }
	 
	 public int getMark( ) {
	  return this.mark;
	 }

	 void Inc() {
	  year++;
	  System.out.print(name);
	  System.out.print("  ");
	  System.out.print(id);
	  System.out.print("  ");
	  System.out.print(year);
	 }
}
