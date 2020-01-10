package ss;

public class Circle extends Shape{
	public Circle(Color color) {
	    super(color);
	  }
	  
	  public Circle(Color color, int radius) {
	    this(color);
	  }

	  @Override
	  public void draw() {
	    if(super.getColor()==Color.red)  System.err.println("()");
	    else System.out.println("()");
	  }
}
