package problem1;

public abstract class Animal implements Sound,Son {
	String name; 
	Integer age; 

	public Animal(String name,Integer age) { 
	this.name=name; 
	this.age=age; 
	} 
	public String toString() { 
	return "Animal with name "+name+" is "+age+" y.o"; 
	} 
	
	public abstract void getSound();
	public void eat() { 
	System.out.println( name+" is eating"); 
	} 
	public abstract void sleep();
}