package DI;

public class Main {
	public static void main(String[] args) {
		MaquinistaPrimera mPrimera= new MaquinistaPrimera("Pepe", "Perez","Aqui", "20 años");
		Locomotora l1= new Locomotora("M234", "4000kh", "50m");
		Tren t1=new Tren("p1", mPrimera, l1);
		
		t1.toString();
		System.out.println(t1);
	}
}
