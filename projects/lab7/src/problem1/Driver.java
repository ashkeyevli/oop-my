package problem1;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat("Kira",8); 
		dog Dog =new dog("KEL",6,"grey");
		System.out.println(cat); 
		cat.getSound(); 
		cat.eat(); 
		cat.eat("wiskas"); 
		System.out.println(Dog); 
		Dog.getSound(); 
		Dog.eat(); 
		Dog.eat("meat");
		Dog.sleep();
	}

}