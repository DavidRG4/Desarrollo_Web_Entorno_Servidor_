package patronDI;

public class Pared {
	private double altura;



	public Pared(double altura) {
		super();
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pared [altura=" + altura + "]";
	}

}
