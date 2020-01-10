package problem4;

public class Test {

	 public static void main(String[] args)
	 {
	  int[] arr = { 0, 10, 20, 30, 40, -5, 60, 70, 80, 90 };
	  MinMax mm = new MinMax();
	  
	  System.out.println(mm.minmax(arr));
	  
	  System.out.println(MinMax.minmax(arr));
	 }
	 
}
