package figuras;

public class Circulo extends Figura2D{
	public double getArea(){
		return Math.PI * Math.pow(getRadio(),2);
	}
	public double getPerimetro() {
		return 2 * Math.PI * getRadio();
	}
}
