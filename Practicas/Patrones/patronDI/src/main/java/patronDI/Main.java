package patronDI;

public class Main {
	public static void main(String[] args) {
		TejadoTejas t1 =new TejadoTejas();
		TejadoTejas t2 =new TejadoTejas();
		Pared p1= new Pared(20.3);
		Pared p2= new Pared(14.5);
		
		Casa c1= new Casa(30.3, t1, p1, p1, p1, p1);
		Casa c2= new Casa(100.3, t2, p2, p2, p2, p2);

		System.out.println(c1);
		System.out.println(c2);
	}
}
