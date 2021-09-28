package DI;

public class Locomotora {
	private String modelo;
	private String potencia;
	private String longitud;

	public Locomotora(String modelo, String potencia, String longitud) {
		super();
		this.modelo = modelo;
		this.potencia = potencia;
		this.longitud = longitud;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	

}
