package problem5;

public abstract class Person {
	private String name; 
	private String address; 
	public Person(String name,String address) { 
	this.name=name; 
	this.address=address; 
	} 
	 public String getname() {
		  return name;
		 }
	 public String getAddress() {
		  return address; 
		 }
	 public void setAddress(String address) {
	       this.address = address;
	   }
	 

	public String toString() { 
	return name+" "+address; 
	} 
}
