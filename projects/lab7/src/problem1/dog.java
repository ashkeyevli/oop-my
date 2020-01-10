package problem1;


public class dog extends Animal implements Sound,Son {
	String color; 

	public dog(String name, Integer age,String color) { 
	super(name, age); 
	this.color=color; 
	} 
	public void getSound() { 
	System.out.println("GAF"); 
	} 
	public String toString() { 
	return super.toString()+"and has "+color+" color"; 
	} 
	public void eat(String food) { 
	System.out.println("The dog "+name+" is eating "+ food); 
	} 
	public void sleep(){ 
		System.out.println("HRRR"); 
		} 
}
