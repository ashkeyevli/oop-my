package lab1_1;
import java.util.Scanner;

public final class lab1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner skan =new Scanner(System.in);
		 String s = skan.next();
		 skan.close();
		 boolean isPalindrome = false;
		 char arr[] = s.toCharArray();
		 for(int i=0; i <= s.length()/2; i++)
		 {
		  if(arr[i]== arr[s.length()-1-i])
		  {
		   isPalindrome = true;
		  }
		  else
		  {
		   isPalindrome = false;
		   break;
		  }
		  
		 }
		 if(isPalindrome == true)
		 {
		  System.out.print("Yes");
		 }
		 else if(isPalindrome == false)
		 {
		  System.out.print("No");
		 }
		

	}

}
