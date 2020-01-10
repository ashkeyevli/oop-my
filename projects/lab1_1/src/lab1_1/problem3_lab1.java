package lab1_1;
import java.util.Scanner;


public class problem3_lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter your score:");
		int a=scan.nextInt();
		scan.close();
		if(a>100) {
			System.out.print("ERROR");
		}
		else if(a>=95) {
			System.out.print("A");
		}
		else if(a<95&&a>=90) {
			System.out.print("A-");
			}
		else if(a<90&&a>=85) {
			System.out.print("B+");
			}
		else if(a<85&&a>=80) {
			System.out.print("B");
			}
		else if(a<80&&a>=75) {
			System.out.print("B-");
			}
		else if(a<75&&a>=70) {
			System.out.print("C+");
			}
		else if(a<70&&a>=65) {
			System.out.print("C");
			}
		else if(a<65&&a>=60) {
			System.out.print("C-");
			}
		else if(a<60&&a>=55) {
			System.out.print("D+");
			}
		else if(a<55&&a>=50) {
			System.out.print("D");
			}
		else if(a<50&&a>=0)
			System.out.print("F");
		else 
			System.out.print("ERROR");
	}

}
