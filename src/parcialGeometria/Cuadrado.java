package parcialGeometria;

public class Cuadrado extends Rectangulo {

	public Cuadrado(double lado) {
		super(lado, lado);
	}
	
	/*Sobreescritura del metodo toString*/
	@Override
	public String toString() {
		return "Cuadrado" + super.toString().replaceAll("Rectangulo", "");
	}
}
