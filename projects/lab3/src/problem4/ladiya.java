package problem4;

public class ladiya extends Piece{

	public ladiya() {
		super();
	}


	public boolean isLegalMove(Position a, Position b) {
		if(a.getX()>'H' || a.getX()<'A') return false;
		if(a.getY()>8 || a.getY()<1) return false;
		if(b.getX()>'H' || b.getX()<'A') return false;
		if(b.getY()>8 || b.getY()<1) return false;
		
		
		else if(a.getX()==b.getX() || a.getY()==b.getY() )
		return true;
		else return false;
	}

}
