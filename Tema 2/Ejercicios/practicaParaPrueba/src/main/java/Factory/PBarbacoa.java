package Factory;

public class PBarbacoa extends Pizza {
	private String nombre;

	public PBarbacoa(String nombre) {

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
		String barbacoa = "Esta pizza lleva Salsa Barbacoa";
		return barbacoa;
	}
}
