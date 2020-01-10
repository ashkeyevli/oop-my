package lab3;

public class Cat extends Animal {
	String color; 
	public Cat(String name, Integer age) { 
	super(name, age); 
	color="Red"; 
	} 
	public Cat(String name, Integer age,String color) { 
	super(name, age); 
	this.color=color; 
	} 
	public void getSound() { 
	System.out.println("Meow"); 
	} 
	public String toString() { 
	return super.toString()+"and has "+color+" color"; 
	} 
	public void eat(String food) { 
	System.out.println("The cat "+name+" is eating "+ food); 
	} 
}
