package lab1_1;
import java.util.Scanner;
import java.lang.Math;
public class pronlem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double a,area,perimeter;
		double diagonal;
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Enter the side of square:");
		a=scan.nextDouble();
		scan.close();
		area=a*a;
		perimeter=4*a;		
		diagonal= Math.sqrt(a*a+a*a);
		
		System.out.println("Perimeter:"+perimeter);
		System.out.println("Area:"+area);
		System.out.println("diagonal:"+diagonal);

	}

}
