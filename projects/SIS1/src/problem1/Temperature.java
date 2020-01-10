package problem1;

public class Temperature {
	 private double degree; 
	 private char scale; 
	 
	 public Temperature()
	 {
	  this.degree = 0;
	  this.scale = 'C';
	 }
	 public Temperature(double degree)
	 {
	  this.degree = degree;
	  this.scale = 'C';
	 }
	 public Temperature(char scale)
	 {
	  this.degree = 0;
	  this.scale = scale;
	 }
	 public Temperature(double degree, char scale)
	 {
	  this.degree = degree;
	  this.scale = scale;
	 }
	 
	 
	 
	 public double getF()
	 {
	  if(scale == 'C') {
	   
	   return (9 * (degree/5)) + 32;
	 
	  }
	  
	  return  degree;
	 }
	 
	 
	 
	 public double getC()
	 {
	  
	  if(scale == 'F')
	  {
	   
	  return  (5 * (degree - 32))/9;
	 	  }
	  return degree;
	 }
	 
	 
	 public void setDegree(double degree)
	 {
	  this.degree = degree;
	 }
	 public void setScale(char scale)
	 {
	  this.scale = scale;
	 }
	 public void setBoth(double degree, char scale)
	 {
	  this.degree = degree;
	  this.scale = scale;
	 }
	 

	 public char getScale()
	 {
	  return scale;
	 }
}
