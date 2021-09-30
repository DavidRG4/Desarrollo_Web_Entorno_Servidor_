package patronFactory;

public class Cuadrado extends Figura {
	private String nombre;

	public Cuadrado(String color) {
		super(color);
		this.nombre = "cuadrado";
	}

	@Override
	public String dibujarFigura() {
		String cuadrado = "Estas dibujando un Cuadrado de color "+super.getColor();
		return cuadrado;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
