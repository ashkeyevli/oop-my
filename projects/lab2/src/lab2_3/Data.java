package lab2_3;

public class Data {
private double average=0;
private double maxi=-1e9-17;
private int count=0;
private double sum=0;


public  double Average() {
	if(count!=0) {
		return average=sum/count;
	}
	else 
		return 0;
}
public double Max() {
	if(count!=0) {
		return maxi;
	}
	else return 0;
}
public void AddData(double a) {
	// TODO Auto-generated method stub
	count++;
	sum=sum+a;
	maxi=Math.max(a, maxi);
}
	
}
