package parcialGeometria;

public class DemoFiguras {

	public static void main(String[] args) {
		
		/*Acumulador de areas*/
		double totalAreas = 0;
		
		/*Creacion de distintas figuras*/
		Figura triangulo = new Triangulo(2, 12);
		Figura rectangulo = new Rectangulo(2, 6);
		Figura cuadrado = new Cuadrado(4);
		
		/*Creacion de array de figuras*/
		Figura[] figuras = {triangulo, rectangulo, cuadrado};
		
		/*Recorrer arreglo*/
		for (Figura figura : figuras) {
			System.out.println(figura);
			totalAreas += figura.getTotalAreas();
		}
		System.out.println("\n");
		System.out.println("total de areas: " + totalAreas);
		
	}

}
