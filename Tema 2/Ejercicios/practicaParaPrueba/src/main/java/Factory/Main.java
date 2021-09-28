package Factory;

public class Main {
	public static void main(String[] args) {
		Pizza p1 = FactoryPizza.getPizza("Tropical");
		Pizza p2 = FactoryPizza.getPizza("Carbonara");
		Pizza p3 = FactoryPizza.getPizza("Barbacoa");

		System.out.println(p1.getPizzas());
		System.out.println(p2.getPizzas());
		System.out.println(p3.getPizzas());

	}

}
