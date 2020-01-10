package problem2;
import java.io.Serializable;


class Instructor implements Serializable {
	private String firstName;
	private String lastName;
	private String department;
	private String email;

	public Instructor(String firstName, String lastName, String department, String email) {
		this.setEmail(email);
		this.setDepartment(department);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	
	public Instructor() {

		

	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return String.format("My name is %s %s. I'm from %s department. My email: %s", firstName, lastName, department, email);
	}
	
	public boolean equals(Object obj) {
		Instructor i = (Instructor) obj;
		return i.getFirstName().equals(firstName) && i.getLastName().equals(lastName) && i.getDepartment().equals(department) && i.getEmail().equals(email);
	}

		

}