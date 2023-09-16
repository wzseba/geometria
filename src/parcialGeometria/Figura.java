package parcialGeometria;

public abstract class Figura implements Comparable<Figura>{
	
	private double area;
	
	public Figura(double area) {
		this.area = area;
	}
	
	/* Final: No se puede sobrescribir un método final en ninguna clase derivada*/
	public final double getArea() {
		return this.area;
	}
	
	public double getTotalAreas() {
		double total = 0;
		return total += getArea();
	}
		
	/*Interfaz comparable, determinar si una figura es mayor o menor que otra segun su area*/
	@Override
	public int compareTo(Figura f) {
		return Double.compare(this.getArea(), f.getArea());
	}

	/*Sobreescritura del metodo toString*/
	@Override
	public String toString() {
		return " area: " + area;
	}
	
}
