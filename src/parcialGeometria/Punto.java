package parcialGeometria;

import static java.lang.Math.*;

public class Punto implements Desplazable{
	
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/*Constructor por defecto*/
	public Punto() {
		this(0, 0);
	}
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public boolean estaSobreY() {
		return x == 0;
	}

	public boolean estaSobreX() {
		return y == 0;
	}

	public boolean esElOrigen() {
		return estaSobreX() && estaSobreY();
	}

	public boolean estaSobreAlgunEje() {
		return estaSobreX() || estaSobreY();
	}
	
	public double distanciaAlOrigen() {
		//return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distancia(new Punto());
	}
	
	public double distancia(Punto origen) {
		return sqrt(pow(origen.x - this.x, 2) + pow(origen.y - this.y,2));
	}
	
	@Override
	public void desplazar(double enX, double enY) {
		this.x += enX;
		this.y += enY;
	}

	
	

	

}
