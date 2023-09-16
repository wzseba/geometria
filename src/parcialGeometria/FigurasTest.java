package parcialGeometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FigurasTest {

	@Test
	void trianguloTest() {
		Triangulo t = new Triangulo(5,  2);
		assertEquals(5, t.getArea());
	}
	
	@Test
	void rectanguloTest() {
		Rectangulo r = new Rectangulo(5,  2);
		assertEquals(10, r.getArea());
	}
	
	@Test
	void cuadradoTest() {
		Cuadrado c = new Cuadrado(5);
		assertEquals(25, c.getArea());
	}

}
