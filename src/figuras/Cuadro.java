package figuras;

public class Cuadro extends Figura2D{
	public double getArea() {
		return Math.pow(getLado(),2);
	}
	
	public double getPerimetro() {
		return 4 * getLado();
	}
}
