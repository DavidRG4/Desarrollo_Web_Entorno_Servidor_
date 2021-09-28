package Factory;

public class PTropical extends Pizza {
	private String nombre;

	public PTropical(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getPizzas() {
		// TODO Auto-generated method stub
		String tropical = "Esta pizza lleva Piña";
		return tropical;
	}

}
