package problem2;

public class Cube extends Shape{
	Integer side;
	double PI=3.14;
	public Cube(Integer side) {
		this.side=side;
	}

	public double volume() {
		return side*side*side;
	}

	public double surfaceArea() {
		return 6*side;
	}
	
}
