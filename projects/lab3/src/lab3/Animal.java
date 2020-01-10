package lab3;

public abstract class Animal {
	String name; 
	Integer age; 
	public Animal(String name,Integer age) { 
	this.name=name; 
	this.age=age; 
	} 
	public abstract void getSound(); 

	public String toString() { 
	return "Animal with name "+name+" is "+age+" y.o"; 
	} 
	public void eat() { 
	System.out.println( name+" is eating"); 
	} 
}
