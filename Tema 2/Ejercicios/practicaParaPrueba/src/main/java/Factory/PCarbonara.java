package Factory;

public class PCarbonara extends Pizza {
	private String nombre;

	public PCarbonara(String nombre) {
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
		String Carbonara="Esta pizza lleva Salsa Carbonara";
		return Carbonara;
	}

}
