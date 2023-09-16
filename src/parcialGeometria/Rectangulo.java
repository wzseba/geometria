package parcialGeometria;

public class Rectangulo extends Figura {
	
	public Rectangulo(double base, double altura) {
		super(base * altura );
		
	}
	
	/*Sobreescritura del metodo toString*/
	@Override
	public String toString() {
		return "Rectangulo" + super.toString();
	}
}
