package problem2;

public class Test {

	public static void main(String[] args) {
		Cylynder cyl = new Cylynder(1,5);
		Cube cub= new Cube(3);
		Sphere sp= new Sphere(4);
		System.out.println(cyl.volume());
		System.out.println(cyl.surfaceArea());
		System.out.println(cub.volume());
		System.out.println(cub.surfaceArea());
		System.out.println(sp.volume());
		System.out.println(sp.surfaceArea());

	}

}
