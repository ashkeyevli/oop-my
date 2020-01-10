package lab1_1;
import java.util.Scanner;
import java.lang.Math;

public class lab1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,r1,r2,r;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a:");
		a=scan.nextDouble();
		System.out.print("b:");
		b=scan.nextDouble();
		System.out.print("c:");
		c=scan.nextDouble();
		Double d=((Math.pow(b,2))-(4*a*c));
		scan.close();
		if(d>0) {
		r1=(-b+Math.sqrt(d))/2*a;
		r2=(-b-Math.sqrt(d))/2*a;
		System.out.println("r1="+r1);
		System.out.println("r2"+r2);
		}
		else if(d==0) {
			r=-b+(Math.sqrt(d))/2*a;
			System.out.print("r="+r);
		}
		else 
		{System.out.print("NO ROOT");}

	}

}
