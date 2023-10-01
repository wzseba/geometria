package parcialGeometria;

public abstract class Figura implements Desplazable, Comparable<Figura>{
	
	private Punto punto;
	
	public Figura(double x, double y) {
		this.punto = new Punto(x,y);
	}
	/*Constructores por defecto*/
	public Figura(Punto p) {
		this.punto = p;
	}
	
	public Figura() {
		this(0,0);
	}
	
	public Punto getPunto() {
		return this.punto;
	}
	
	/* Implementar para todas las figuras el metodo getArea */
	public abstract double getArea();
	
		
	/*Interfaz comparable, determinar si una figura es mayor o menor que otra segun su area*/
	@Override
	public int compareTo(Figura f) {
		return Double.compare(this.getArea(), f.getArea());
	}
	
}
