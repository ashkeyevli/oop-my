package problem3;

public class Person {
	private String first_name, last_name;

	public Person(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Person)) {
			return false;
		}
		Person p = (Person) o;
		return p.first_name.equals(this.first_name) && p.last_name.equals(this.last_name);
	}

	public String toString() {
		return first_name + " " + last_name;
	}

}
