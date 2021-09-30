package patronFactory;

public class Triangulo extends Figura {
	private String nombre;
	public Triangulo(String color) {
		super(color);
		this.nombre="triangulo";
	}

	@Override
	public String dibujarFigura() {
		String triangulo="Estas dibujando un triangulo de color "+super.getColor();
		return triangulo;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
