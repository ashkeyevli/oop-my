package ss;


public class Triangle extends Shape {
  private int side; 
  public Triangle(Color color, int side) {
    super(color);
    this.side = side;
  }

  @Override
  public void draw() {
	    if(super.getColor()==Color.red) {
	      if(side == 1) System.err.println("<|");
	      else System.err.println("|>");
	    }
	    else {
	      if(side == 1) System.out.println("<|");
	      else System.out.println("|>");
	    }
	  }

}