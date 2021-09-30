package patronSingleton;

public class Presidente {
	private String nombre;
	private String apellidos;
	private String yearElection;
	private static Presidente presidente = null;

	private Presidente(String nombre, String apellidos, String yearElection) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.yearElection = yearElection;
	}

	public static Presidente getPresident(String nombre, String apellidos, String yearElection) {
		if (presidente == null) {
			presidente = new Presidente(nombre, apellidos, yearElection);
		}
		return presidente;
	}

	@Override
	public String toString() {
		return "Presidente [nombre=" + nombre + ", apellidos=" + apellidos + ", yearElection=" + yearElection + "]";
	}

}
