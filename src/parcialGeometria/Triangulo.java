package parcialGeometria;

public class Triangulo extends Figura {

	public Triangulo(double base, double altura) {
		super(base * altura / 2);
	}
	
	@Override
	public String toString() {
		return "Triangulo" + super.toString();
		
	}
}
