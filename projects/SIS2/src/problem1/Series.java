package problem1;

public class Series extends Circuit{	

	protected Circuit a;

	protected Circuit b;

	public Series(Circuit a, Circuit b) {

		this.a = a;

		this.b = b;

	}


	public double getResistance() {

		return a.getResistance() + b.getResistance();

	}

	public double getPotentialDiff() {

		return a.getPotentialDiff() + b.getPotentialDiff();

	}

	public void applyPotentialDiff(double v) {		

		a.applyPotentialDiff(getCurrent(v) * a.getResistance());

		b.applyPotentialDiff(getCurrent(v) * b.getResistance());

	}

	public double getCurrent(double v) {

		return v/getResistance();		

	}
}