package patronFactory;

public class FactoryFigura {
	public static Figura getFigura(String tipo, String color) {
		if (tipo.equalsIgnoreCase("triangulo")) {
			return new Triangulo(color);
		} else if (tipo.equalsIgnoreCase("circulo")) {
			return new Circulo(color);
		} else if (tipo.equalsIgnoreCase("cuadrado")) {
			return new Cuadrado(color);
		} else {
			return new Rectangulo(color);
		}

	}

}
