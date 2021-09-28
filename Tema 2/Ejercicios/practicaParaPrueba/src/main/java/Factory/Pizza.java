package Factory;

public abstract class Pizza {
	private String tipoPizza;
	
	public String getTipoPizza() {
		return tipoPizza;
	}

	public void setTipoPizza(String tipoPizza) {
		this.tipoPizza = tipoPizza;
	}

	public abstract String getPizzas();
}
