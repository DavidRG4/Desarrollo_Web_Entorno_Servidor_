package patronDI;

public class Casa {
	private double area;
	private TejadoTejas tejadotejas;
	private Pared paredeast;
	private Pared paredwest;
	private Pared parednorth;
	private Pared paredsouth;

	public Casa(double area, TejadoTejas tejadotejas, Pared paredeast, Pared paredwest, Pared parednorth,
			Pared paredsouth) {
		super();
		this.area = area;
		this.tejadotejas = tejadotejas;
		this.paredeast = paredeast;
		this.paredwest = paredwest;
		this.parednorth = parednorth;
		this.paredsouth = paredsouth;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public TejadoTejas getTejadotejas() {
		return tejadotejas;
	}

	public void setTejadotejas(TejadoTejas tejadotejas) {
		this.tejadotejas = tejadotejas;
	}

	public Pared getParedeast() {
		return paredeast;
	}

	public void setParedeast(Pared paredeast) {
		this.paredeast = paredeast;
	}

	public Pared getParedwest() {
		return paredwest;
	}

	public void setParedwest(Pared paredwest) {
		this.paredwest = paredwest;
	}

	public Pared getParednorth() {
		return parednorth;
	}

	public void setParednorth(Pared parednorth) {
		this.parednorth = parednorth;
	}

	public Pared getParedsouth() {
		return paredsouth;
	}

	public void setParedsouth(Pared paredsouth) {
		this.paredsouth = paredsouth;
	}

	@Override
	public String toString() {
		return "Casa [area=" + area + ", tejadotejas=" + tejadotejas + ", paredeast=" + paredeast + ", paredwest="
				+ paredwest + ", parednorth=" + parednorth + ", paredsouth=" + paredsouth + "]";
	}
	

}
