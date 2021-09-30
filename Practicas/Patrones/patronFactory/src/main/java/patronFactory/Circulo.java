package patronFactory;

public class Circulo extends Figura {
	private String nombre;

	public Circulo(String color) {
		super(color);
		this.nombre = "circulo";
	}

	@Override
	public String dibujarFigura() {
		String circulo = "Estas dibujando un circulo de color "+super.getColor();
		return circulo;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
