package lab2_2;
import java.util.Scanner;
public class lab2_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		Drow drow=new Drow(a);
		System.out.println(drow);
		scan.close();
}
}

 class Drow{
	public int n;
	public Drow(int n) {
		this.n=n;
	}
	public String toString() {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++)
			{System.out.print("[*]");
		}
			System.out.println("");
	}
		return "";
}
}





