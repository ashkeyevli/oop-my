package problem4;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import lab2_4.Time ;
import problem3.Employee;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Object [] o = new Object[12];
		Date d = new Date();
		Chocolate [] c = new Chocolate[2];
		c[0] = new Chocolate("Twix", 142);
		c[1] = new Chocolate("Snikers", 11);
		Time [] t = new Time[2];
		t[0] = new Time(12, 53, 23);
		t[1] = new Time(6, 23,5);
	
		Chocolate [] c1 =new Chocolate[2];
		c1 = c.clone();
		
		
		
		Time [] t1 = new Time[2];
		t1 = t.clone();
		
		Employee [] e = new Employee[2];
		
		e[0] = new Employee("Bro","oko", d,200.5, "20BFsfgja");
		e[1] = new Employee("aka","kaka", d,202.5, "24BFsfgja");
		
		Employee [] e1 = new Employee[2]; 
		e1 = e.clone();
		
		Sort.BubbleSort(c);
		Sort.mergeSort(c1,0, c1.length-1);
		
		Sort.BubbleSort(t);
		Sort.mergeSort(t1, 0, t1.length-1);
		
		Sort.BubbleSort(e);
		Sort.mergeSort(e1, 0, e.length-1);
		
		for(int i = 0; i < 2; i++) {
			System.out.println(c[i]);
		}
		
		for(int i = 0; i < 2; i++) {
			System.out.println(c1[i]);
		}
		
		for(int i = 0; i < 2; i++) {
			System.out.println(t[i]);
		}
		
		for(int i = 0; i < 2; i++) {
			System.out.println(t1[i]);
		}
		
		for(int i = 0; i < 2; i++) {
			System.out.println(e[i]);
		}
		
		for(int i = 0; i < 2; i++) {
			System.out.println(e1[i]);
		}

	}

}
