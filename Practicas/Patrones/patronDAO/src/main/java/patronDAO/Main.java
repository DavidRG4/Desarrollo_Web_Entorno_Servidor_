package patronDAO;

public class Main {
public static void main(String[] args) {
	PaymentDAOImplements p = null;
	System.out.println("Lista de Empleados");
	System.out.println(p.getPayments());
	System.out.println(p.createPayments(20, 30, "2002-04-21", 20));
}
}
