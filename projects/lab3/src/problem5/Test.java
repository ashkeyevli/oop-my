package problem5;


import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
        Vector<Person> person = new Vector<Person>(); 
 
        while(true){ 
            System.out.println("1. add person"); 
            System.out.println("2. display persons"); 
            int choice = input.nextInt(); 
            if(choice==1){ 
                Person p; 
                System.out.println("1. add student"); 
                System.out.println("2. add employee"); 
                int choiceAdd = input.nextInt(); 
                if(choiceAdd==1){ 
                    String name = input.next();                     
                    String address = input.next(); 
                    String program = input.next(); 
                    int year = input.nextInt(); 
                    double fee = input.nextDouble(); 
                    p = new Student(name,address,program,year,fee); 
                    person.add(p); 
                } 
                else if(choiceAdd==2){                   
                    String name = input.next(); 
                    String address = input.next(); 
                    String school = input.next(); 
                    double pay = input.nextDouble(); 
                    p = new Staff(name,address,school,pay); 
                    person.add(p); 
 
                } 
              
            
             
            }else{ 
                System.out.println("Students:"); 
                for(int i =0;i<person.size();i++){ 
                    if(person.get(i) instanceof Student){ 
                        System.out.println(person.get(i)); 
                    } 
                }
                  System.out.println("Staff:"); 
                    for(int j =0;j<person.size();j++){ 
                        if(person.get(j) instanceof Staff){ 
                            System.out.println(person.get(j)); 
                        } 
                    } 
                
            } 
        } 
	}

}
