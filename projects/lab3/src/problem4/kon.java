package problem4;

public class kon extends Piece{
	public kon() {
		super();
	}

	
	public boolean isLegalMove(Position a, Position b) {
		if(a.getX()>'H' || a.getX()<'A') return false;
		if(a.getY()>8 || a.getY()<1) return false;
		if(b.getX()>'H' || b.getX()<'A') return false;
		if(b.getY()>8 || b.getY()<1) return false;
		
		else if(Math.abs(a.getX()-b.getX())==2 && Math.abs(a.getY()-b.getY())==1) return true;
		else if(Math.abs(a.getX()-b.getX())==1 && Math.abs(a.getY()-b.getY())==2) return true;
		else return false;
	}
	
}
