package figuras;

public class Esfera extends Figura3D{
	public double getVolumen() {
		return (4/3) * Math.PI * Math.pow(getRadio(), 3);
	}
}
