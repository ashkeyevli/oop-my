package problem2;

public class Sphere extends Shape{
	Integer radius;
	double PI=3.14;
	public Sphere(Integer radius) {
		this.radius=radius;
	}
	
	public double volume() {
		return 4*PI*radius*radius*radius/3;
	}
	
	public double surfaceArea() {
		return 4*PI*radius*radius;
	}
	
}
