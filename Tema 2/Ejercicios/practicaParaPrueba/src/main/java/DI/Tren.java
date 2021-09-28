package DI;

import java.security.InvalidParameterException;

public class Tren {

	private String modelo;
	private MaquinistaPrimera mPrimera;
	private Locomotora locomotora;

	public Tren(String modelo, MaquinistaPrimera mPrimera, Locomotora locomotora) {
		this.modelo = modelo;
		if (mPrimera == null) {
			throw new InvalidParameterException("Maquinista no puede ser null");
		}
		if (locomotora == null) {
			throw new InvalidParameterException("Locomotora no puede ser null");
		}
		this.mPrimera= mPrimera;
		this.locomotora= locomotora;
	}

	@Override
	public String toString() {
		return "Tren [modelo=" + modelo + ", mPrimera=" + mPrimera + ", locomotora=" + locomotora + "]";
	}
	
	
	
	
	

}
