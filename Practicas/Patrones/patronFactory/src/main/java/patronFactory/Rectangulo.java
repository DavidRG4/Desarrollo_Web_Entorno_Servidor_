package patronFactory;

public class Rectangulo extends Figura {
	private String nombre;

	public Rectangulo(String color) {
		super(color);
		this.nombre = "Rectangulo";
	}

	@Override
	public String dibujarFigura() {
		String rectangulo = "Estas dibujando un rectangulo de color "+super.getColor();
		return rectangulo;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
