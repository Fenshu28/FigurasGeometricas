package figuras;

public class Romboide extends Figura2D {
	private double base;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getArea(){
		return getBase() * getAltura();
	}
	public double getPerimetro() {
		return 2 * (getBase() + getLado());
	}
	
}
