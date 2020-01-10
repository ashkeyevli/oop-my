package ss;



public class Rectangle extends Shape {
  
  public Rectangle(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    if(super.getColor()==Color.red) System.err.println("[]");
    else System.out.println("[]");
    
  }

}