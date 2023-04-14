package figuras;

public class Rombo {
	private double diagonalMayor;
	private double diagonalMenor;
	public double getDiagonalMayor() {
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	
	public double getArea(){
		return  (diagonalMayor * diagonalMenor)/2;
	}
	public double getPerimetro() {
		double ladoRombo = Math.sqrt( Math.pow((diagonalMayor/2),2) + Math.pow(diagonalMenor/2,2) );
		return 4 * ladoRombo;
	}
	
	
}
