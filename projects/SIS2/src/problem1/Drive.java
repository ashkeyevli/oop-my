package problem1;

public class Drive {
	public static void main(String[] args) {

		Circuit a = new Resistor(3.0);

		Circuit b = new Resistor(3.0);

		Circuit c = new Resistor(6.0);

		Circuit d = new Resistor(3.0);

		Circuit e = new Resistor(2.0);

		Circuit f = new Series(a, b);		

		Circuit g = new Parallel(c, d);		

		Circuit h = new Series(g, e);		

		Circuit circuit = new Parallel(f, h);

		double r = circuit.getResistance();

		circuit.applyPotentialDiff(10);

		System.out.println(circuit.getPower());

	}

}
