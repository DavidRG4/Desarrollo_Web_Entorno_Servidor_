package Factory;

public class FactoryPizza {
	public static Pizza getPizza(String tipo) {
		if (tipo.equals("Carbonara")) {
			return new PCarbonara(tipo);
		}else if (tipo.equals("Barbacoa")) {
			return new PBarbacoa(tipo);
		}else {
			return new PTropical(tipo);
		}
		
	}
}
