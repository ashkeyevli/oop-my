package ss;

import java.util.Vector;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Shape> shapes = new Vector<Shape>();
	    
	    Shape c = new Circle(Color.black);
	    Shape r = new Rectangle(Color.red);
	    Shape t = new Triangle(Color.black, 1);
	    Shape t2 = new Triangle(Color.red, 2);
	    
	    shapes.add(c);
	    shapes.add(r);
	    shapes.add(t);
	    shapes.add(t2);
	    
	    for (int i = 0; i < shapes.size(); i++) {
	      shapes.get(i).draw();
	    }
	    
	    System.out.println(Shape.cnt);
	}

}
