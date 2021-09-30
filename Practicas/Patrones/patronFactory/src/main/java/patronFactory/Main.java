package patronFactory;

public class Main {

	public static void main(String[] args) {
		Figura t1 = FactoryFigura.getFigura("triangulo", "rojo");
		Figura c1 = FactoryFigura.getFigura("circulo", "azul");
		Figura cu1 = FactoryFigura.getFigura("cuadrado", "amarillo");
		Figura r1 = FactoryFigura.getFigura("rectangulo", "verde");

		System.out.println(t1.dibujarFigura());
		System.out.println(cu1.dibujarFigura());
		System.out.println(c1.dibujarFigura());
		System.out.println(r1.dibujarFigura());
	}
}
