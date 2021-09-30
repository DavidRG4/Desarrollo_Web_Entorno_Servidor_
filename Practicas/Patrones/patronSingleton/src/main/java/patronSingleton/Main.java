package patronSingleton;

public class Main {
	public static void main(String[] args) {
		Presidente p1 = Presidente.getPresident("Pepe","Perez","2002");
		Presidente p2 = Presidente.getPresident("Pepa","Martinez","2001");
		
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2));
	}
}
