package ss;

public abstract class Shape {
	public static int cnt;
	  private Color color;
	  {
	    cnt++;
	  }

	  public Shape(Color color) {
	    this.color = color;
	  }

	  public abstract void draw();
	  
	  public void setColor(Color color) {
	    this.color = color;
	  }

	  public Color getColor() {
	    return color;
	  }
}
