package DI;

public class MaquinistaPrimera extends Maquinista {
	private String antiguedad;

	public MaquinistaPrimera(String nombre, String apellidos, String direccion, String antiguedad) {
		super(nombre, apellidos, direccion);
		this.antiguedad = antiguedad;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

}
