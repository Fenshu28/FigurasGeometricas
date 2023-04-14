package figuras;

public class Cilindro extends Figura3D {
	public double getVolumen() {
		return Math.PI * Math.pow(getRadio(), 2) * getAltura();
	}
}
