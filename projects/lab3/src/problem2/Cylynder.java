package problem2;

public class Cylynder extends Shape{
	Integer height,radius;
	double PI=3.14;
	public Cylynder(Integer height,Integer radius) {
		this.height=height;
		this.radius=radius;
	}
	
	public double volume() {
		return PI*radius*radius*height;
	}

	
	public double surfaceArea() {
		return 2*PI*radius*height+2*PI*radius*radius;
	}
	
}
