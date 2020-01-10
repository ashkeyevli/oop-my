package problem4;

public class MinMax {

	 static class Result
	 {
	  int minArr;
	  int maxArr;
	  public Result(int minArr, int maxArr)
	  {
	   this.minArr = minArr;
	   this.maxArr = maxArr;
	   
	  }
	  
	  public String toString()
	  {
	   return String.format("%s: %d %s: %d", "Min", minArr, "Max", maxArr);
	  }
	  
	 }
	 
	 public static Result minmax(int arr[])
	 {
	  int minArr = Integer.MAX_VALUE;
	  int maxArr = Integer.MIN_VALUE;
	  for(int i = 0; i < arr.length; i++)
	  {
	   if(arr[i] < minArr) minArr = arr[i];
	   if(arr[i] > maxArr) maxArr = arr[i];
	  }
	  Result res = new Result(minArr, maxArr);
	  return res;
	 }
}
