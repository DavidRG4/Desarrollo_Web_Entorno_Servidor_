package factory;

public class factoriaAnimales {
public static Animal getAnimal(String tipo) {
	if (tipo.equals("gato")) {
		return new Gato();
	}else if (tipo.equals("perro")) {
		return new perro();
	}else {
		return new vaca();
	}
	
}
}
