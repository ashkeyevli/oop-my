package lab2_3;
import java.util.Scanner;

public class Analyzer {
public String input;
Scanner scan= new Scanner(System.in);
Data ds=new Data();
public void Result() {
	while(true) {
		System.out.print("Enter number(Q to quite:)");
		input=scan.nextLine();
		if(input.equals("Q")||input.equals("q") ){
			break;
		}
		else 
			ds.AddData(Double.parseDouble(input));
			}
	System.out.println(ds.Average());
	System.out.println(ds.Max());
	
}
}
