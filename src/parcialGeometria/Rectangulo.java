package parcialGeometria;

public class Rectangulo extends Figura {

	private Punto puntoSupDerecho;
	
	public Rectangulo(double x1, double y1, double x2, double y2) {
		super(x1,y1);
		this.puntoSupDerecho = new Punto(x2,y2);
	}

	@Override
	public void desplazar(double deltax, double deltay) {
		super.getPunto().desplazar(deltax, deltay);
		this.puntoSupDerecho.desplazar(deltax, deltay);
	}

	@Override
	public double getArea() {
		double base = this.puntoSupDerecho.getX() - super.getPunto().getX();
		System.out.println(base);
		double altura = this.puntoSupDerecho.getY() - super.getPunto().getY();
		System.out.println(altura);
		return base*altura; 
	}
	
	
}
