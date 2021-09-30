package patronDAO;

import java.util.List;

public interface PaymentSao {
	public boolean createPayments(Integer customerNumb,Integer checkNumb,String paymentDate,Integer amount);
	public List<Payments> getPayments();
}
