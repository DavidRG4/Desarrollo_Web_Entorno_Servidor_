package factory;

public class main {
public static void main(String[] args) {
	Animal a1= factoriaAnimales.getAnimal("gato");
	Animal a2= factoriaAnimales.getAnimal("perro");
	Animal a3= factoriaAnimales.getAnimal("vaca");
	a1.setNombre("gato");
	a2.setNombre("perro");
	a3.setNombre("vaca");
	
	System.out.println(a1.getSaludo());
	System.out.println(a2.getSaludo());
	System.out.println(a3.getSaludo());

}
}
