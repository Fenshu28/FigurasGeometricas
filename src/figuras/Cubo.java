package figuras;

public class Cubo extends Figura3D {
	public double getVolumen() {
		return Math.pow(getLado(),3);
	}
}
